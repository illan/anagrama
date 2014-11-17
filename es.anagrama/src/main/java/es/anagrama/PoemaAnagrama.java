package es.anagrama;

import java.util.*;
import java.util.regex.Pattern;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PoemaAnagrama extends Anagrama
{
    
    public String SEPARADOR;
    
    public static String PALABRAS="[^\\w]";
    
    public PoemaAnagrama(){
       super(PALABRAS);    
       SEPARADOR=System.getProperty("line.separator").toString();
    }
    
    public List<String> split(String cadena){
       return java.util.Arrays.asList(cadena.split(SEPARADOR));
    }
    public boolean isPoemaAnagrama(String texto){
        List<String>  versos=split(texto);
        return isPoemaAnagrama(versos);
    }    
    public boolean isPoemaAnagrama(List<String> versos){    
        for (String linea:versos){
            
            for (String otra:versos){
                if (otra == linea) continue;
                if (!isAnagrama(linea,otra))
                    return false;
            }
            //return true;
        }
        return true;
    }

  static void usage(String file){
      System.err.println("Error opening file:"+file);
      System.exit(-1);
  }    

  public static void main(String[] args){
        if (args.length<1) usage("");
            String filename=args[0];
        try{
             Path file = Paths.get(filename);
             List<String> lines = Files.readAllLines(file, Charset.defaultCharset());
           if( (new PoemaAnagrama()).isPoemaAnagrama(lines)){
               System.out.println(filename+" es anagrama");
               
           }else{
               System.out.println(filename+" no es anagrama");
               
           }
        }catch(Exception e){
            usage(filename);
            System.exit(-1);
        }
    }
}
