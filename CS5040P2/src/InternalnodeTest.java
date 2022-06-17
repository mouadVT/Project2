import student.TestCase;

/**
 * Tests Internalnode methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/17/2022
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
     * Test the print method.
     */
    public void testPrint() {
        interNode.insert("A", 0);
        interNode.insert("AA", 0);
        interNode.print(0, "");
        String st = "sequence A inserted at level 1\n"
            + "sequence AA inserted at level 2\n";
        String st1 = "I\r\n" + "  I\r\n" + "    AA\r\n" + "    E\r\n"
            + "    E\r\n" + "    E\r\n" + "    E\r\n" + "  E\r\n" + "  E\r\n"
            + "  E\r\n" + "  E";
        assertFuzzyEquals(st + st1, systemOut().getHistory());
        interNode.print(0, "lengths");

        systemOut().clearHistory();

        System.out.println(" no data in here ");
        System.out.println(systemOut().getHistory());

        // lengths
        // stats
// String console = systemOut().getHistory();
// System.out.println(output);

    }


    /**
     * Test the insert() method.
     */
    public void testInsert() {
        interNode.insert("A", 0);
        interNode.insert("G", 0);
        interNode.insert("T", 0);
        interNode.insert("C", 0);
        interNode.insert("AA", 0);
        interNode.insert("AG", 0);
        interNode.insert("AT", 0);
        interNode.insert("AC", 0);
        interNode.insert("AGC", 0);
        interNode.print(0, "");
        
// String console = systemOut().getHistory();
// String st = "sequence A inserted at level 1\n"
// + "sequence G inserted at level 1\n"
// + "sequence T inserted at level 1\n"
// + "sequence C inserted at level 1\n" + "sequence A already exists\n"
// + "sequence AA inserted at level 2\n"
// + "sequence AG inserted at level 2\n"
// + "sequence AT inserted at level 2\n"
// + "sequence AC inserted at level 2\n"
// + "sequence AGC inserted at level 3\n";
// assertEquals(console, st);
// systemOut().clearHistory();
    }


    /**
     * Test the search method.
     */
    public void testSerch() {
// interNode.insert("ACGT", 0);
// interNode.insert("AAAA", 0);
// interNode.insert("AA", 0);
// String console = systemOut().getHistory();
// System.out.println(console);
// interNode.search("AA$", 0);

        // interNode.print(0, "");
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
