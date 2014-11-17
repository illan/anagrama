package es.anagrama;

import java.util.*;
import java.util.regex.Pattern;
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
}
