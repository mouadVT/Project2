import student.TestCase;

/**
 * Tests FlyWeightNode methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class FlyweightnodeTest extends TestCase {

    private Baseclass fw;
    
    /**
     * Sets up each test method.
     */
    public void setUp() {
        fw = new FlyWeightNode();
    }


    /**
     * Tests insert() method.
     */
    public void testInsert() {
        fw = fw.insert("ACGT", 0);
    }


    /**
     * Tests print() method.
     */
    public void testPrint() {
    }


    /**
     * Test the search method.
     */
    public void testSerch() {
    }


    /**
     * test the remove method
     */
    public void testRemove() {
    }


    /**
     * Test the Number Of Node Visited
     */
    public void testNumOfNodeVisited() {
    }
}
