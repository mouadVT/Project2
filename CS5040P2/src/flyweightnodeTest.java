import student.TestCase;

/**
 * Tests flyweightnode methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class flyweightnodeTest extends TestCase {
    
    private Baseclass fw;
    
    /**
     * Sets up each test method.
     */
    public void setUp() {
        fw = new flyweightnode();
    }
    
    
    /**
     * Tests insert() method.
     */
    public void testInsert() {
        //assertEquals("E", fw.print(0));
        
        fw = fw.insert("ACGT", 0);
        
        //assertEquals("ACGT", fw.print(0));
    }
    
    
    /**
     * Tests print() method.
     */
    public void testPrint() {
        //assertEquals("E", fw.print(0));
    }
}
