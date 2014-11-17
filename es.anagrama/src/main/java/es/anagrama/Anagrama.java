package es.anagrama;
import org.apache.commons.collections.*;
import java.util.*;
import java.util.regex.Pattern;
public class Anagrama extends HashBag{

    public Anagrama(){
       super();
       this.separador=".";
    } 
    String separador; // por defecto cada letra
    public Anagrama(String separador){
       super();
       this.separador=separador ;   
    }  

    public Anagrama fill(String cadena){
        addAll(split(cadena,separador));
        return this;
    }
    public List<String> split(String cadena,String regex){
        Pattern p = Pattern.compile(regex);
       return java.util.Arrays.asList(p.split(cadena));
    }
    public boolean isAnagrama(String texto,String cadena){
        clear();
        return fill(texto).containsAll(split(cadena,separador));
        
    }


    
}