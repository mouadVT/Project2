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
        assertFuzzyEquals("sequence ACGT inserted at level 0", systemOut()
            .getHistory());
        systemOut().clearHistory();
    }


    /**
     * Tests print() method.
     */
    public void testPrint() {
        fw.print(0, "");
        assertFuzzyEquals("E", systemOut().getHistory());
        systemOut().clearHistory();
    }


    /**
     * Test the search method.
     */
    public void testSearch() {
        fw.search("A", 0);
        assertFuzzyEquals("no sequence found", systemOut().getHistory());
        systemOut().clearHistory();
    }


    /**
     * test the remove method
     */
    public void testRemove() {
        fw.remove("A", 0);
        assertFuzzyEquals("sequence A does not exist", systemOut()
            .getHistory());
        systemOut().clearHistory();
    }


    /**
     * Test the Number Of Node Visited
     */
    public void testNumOfNodeVisited() {
        assertEquals(1, fw.numOfNodeVisited("A", 0));
    }
}
