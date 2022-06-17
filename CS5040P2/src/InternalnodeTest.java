import student.TestCase;

/**
 * Tests Internalnode methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class InternalnodeTest extends TestCase {
    private Baseclass interNode;

    /**
     * Sets up each test method.
     */
    public void setUp() {
        interNode = new Internalnode();
    }

    
    /**
     * Test the insert() method.
     */
    public void testInsert() {
        // java.lang.StringIndexOutOfBoundsException: String index out of range:
        // 4
        interNode.insert("ACGT", 0);
        // interNode.insert("AAAA", 0);
        // interNode.insert("AA", 0);
        // interNode.insert("AAACCCCGGTGAAAACGTA", 0);
        // interNode.insert("ACTGGGAA", 0);
        interNode.print(0, "");
    }


    /**
     * Test the print method.
     */
    public void testPrint() {
        // System.out.println(interNode.print(0));
    }


    /**
     * Test the search method.
     */
    public void testSerch() {
        interNode.insert("ACGT", 0);
        interNode.insert("AAAA", 0);
        interNode.insert("AA", 0);

        interNode.search("AA$", 0);

        interNode.print(0, "");
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


    /**
     * Test set the leaf Node.
     */
    public void testSetTheLeafNode() {
    }
}
