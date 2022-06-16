
import student.TestCase;

public class InternalnodeTest extends TestCase  {
    private Internalnode interNode;

    /**
     * Sets up each test method.
     */
    public void setUp() {
        interNode= new Internalnode();
        
    }
    /**
     * Test the insert() method.
     */
    public void testInsert() {
        // print
        System.out.println(interNode.insert("AG", 0));  
    }
    /**
     * Test the print method.
     */
    public void testPrint() {
        System.out.println(interNode.print(0));  
    }
    /**
     * Test the search method.
     */
    public void testSerch() {
        //System.out.println(interNode.search("AG", 0));  
    }
    /**
     * Test the Remove method.
     */
    public void testRemove() {
        System.out.println(interNode.remove("AG", 0));  
    }
}
