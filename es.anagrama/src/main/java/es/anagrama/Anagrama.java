package es.anagrama;

public class Anagrama extends java.util.Bag{

    public Anagrama(String cadena){
       super();    
       super.putAll(cadena);
        
    }
    public bool isAnagrama(String texto){
        return super.equals(new Anagrama(texto));
        
    }

        public static void main( String[] args )
    {
        
    }

    
}