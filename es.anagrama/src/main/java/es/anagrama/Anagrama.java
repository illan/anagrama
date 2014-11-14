package es.anagrama;

public class Anagrama extends org.apache.commons.collections.HashBag{

    public Anagrama(String cadena){
       super();    
       super.putAll(cadena);
        
    }
    public bool isAnagrama(String texto){
        return super.equals(new Anagrama(texto));
        
    }


    
}