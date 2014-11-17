package es.anagrama;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import es.anagrama.Anagrama;
import es.anagrama.PoemaAnagrama;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testAnagramaTrivial()
    {

        assertTrue((new Anagrama()).isAnagrama("qwe","qwe"));
    }
    public void testAnagrama()
    {
        assertTrue((new Anagrama()).isAnagrama("qwe","wqe"));
    }
        public void testFraseAnagrama()
    {
        assertTrue((new Anagrama("[\\s]")).isAnagrama("qwe ewq","qwe ewq"));
    }

    public void testPoemaAnagrama()
    {

        assertTrue((new PoemaAnagrama()).isPoemaAnagrama("q w e\nw q e"));
    }
     public void testFalsePoemaAnagrama()
    {

        assertFalse((new PoemaAnagrama()).isPoemaAnagrama("q w e\nw q e\nd f r"));
    }
}
