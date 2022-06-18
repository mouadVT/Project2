import student.TestCase;

/**
 * Tests LeafNode methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class LeafNodeTest extends TestCase {

    private Baseclass leaf;

    /**
     * Sets up each test method.
     */
    public void setUp() {
        leaf = new LeafNode("ACGT", 0);
    }


    /**
     * Tests SequenceStats method.
     */
    public void testSequenceStats() {
        assertEquals(" A:25.00 C:25.00 G:25.00 T:25.00", ((LeafNode)leaf)
            .sequenceStats("ACGT"));
    }


    /**
     * Tests print() method.
     */
    public void testPrint() {
        leaf.print(0, "");
        assertFuzzyEquals("ACGT", systemOut().getHistory());
        systemOut().clearHistory();

        leaf = leaf.insert("AAAA", 0);
        systemOut().clearHistory();

        leaf.print(0, "lengths");
        assertFuzzyEquals("I\r\n" + "  I\r\n" + "    AAAA 4\r\n"
            + "    ACGT 4\r\n" + "    E\r\n" + "    E\r\n" + "    E\r\n"
            + "  E\r\n" + "  E\r\n" + "  E\r\n" + "  E", systemOut()
                .getHistory());
        systemOut().clearHistory();

        leaf.print(0, "stats");
        assertFuzzyEquals("I\r\n" + "  I\r\n"
            + "    AAAA A:100.00 C:0.00 G:0.00 T:0.00\r\n"
            + "    ACGT A:25.00 C:25.00 G:25.00 T:25.00\r\n" + "    E\r\n"
            + "    E\r\n" + "    E\r\n" + "  E\r\n" + "  E\r\n" + "  E\r\n"
            + "  E", systemOut().getHistory());
        systemOut().clearHistory();
    }


    /**
     * Tests insert() method.
     */
    public void testInsert() {
        Baseclass leaf2 = new FlyWeightNode();
        
        
        systemOut().clearHistory();
        leaf2 = leaf2.insert("A", 0);
        leaf2 = leaf2.insert("A", 0);
        leaf2 = leaf2.insert("C", 0);
        systemOut().clearHistory();
        leaf2.print(0, "");
        String output = "I\r\n"
            + "  A\r\n"
            + "  C\r\n"
            + "  E\r\n"
            + "  E\r\n"
            + "  E";
        String console = systemOut().getHistory();
        assertFuzzyEquals(console, output);
        
        Baseclass leaf3 = new FlyWeightNode();
        systemOut().clearHistory();
        leaf3 = leaf3.insert("C", 0);
        leaf3 = leaf3.insert("TAC", 0);
        leaf3 = leaf3.insert("GCTA", 0);
        systemOut().clearHistory();
        leaf3.print(0, "");
        output = "I\r\n"
            + "  E\r\n"
            + "  C\r\n"
            + "  GCTA\r\n"
            + "  TAC\r\n"
            + "  E";
        console = systemOut().getHistory();
        assertFuzzyEquals(console, output);
        
        Baseclass leaf4 = new FlyWeightNode();
        systemOut().clearHistory();
        leaf4 = leaf4.insert("G", 0);
        leaf4 = leaf4.insert("TAG", 0);
        leaf4 = leaf4.insert("GCTA", 0);
        leaf4 = leaf4.insert("ACGG", 0);
        systemOut().clearHistory();
        leaf4.print(0, "");
        output = "I\r\n"
            + "  ACGG\r\n"
            + "  E\r\n"
            + "  I\r\n"
            + "    E\r\n"
            + "    GCTA\r\n"
            + "    E\r\n"
            + "    E\r\n"
            + "    G\r\n"
            + "  TAG\r\n"
            + "  E";
        console = systemOut().getHistory();
        assertFuzzyEquals(console, output);
        
        Baseclass leaf5 = new FlyWeightNode();
        systemOut().clearHistory();
        leaf5 = leaf5.insert("T", 0);
        leaf5 = leaf5.insert("GAT", 0);
        leaf5 = leaf5.insert("TCTTTTACATTTT", 0);
        leaf5 = leaf5.insert("TCTTTTACATGAGAT", 0);
        leaf5 = leaf5.insert("TTTAAGTACATTTGA", 0);
        leaf5 = leaf5.insert("A", 0);
        systemOut().clearHistory();
        leaf5.print(0, "");
        output = "I\r\n"
            + "  A\r\n"
            + "  E\r\n"
            + "  GAT\r\n"
            + "  I\r\n"
            + "    E\r\n"
            + "    I\r\n"
            + "      E\r\n"
            + "      E\r\n"
            + "      E\r\n"
            + "      I\r\n"
            + "        E\r\n"
            + "        E\r\n"
            + "        E\r\n"
            + "        I\r\n"
            + "          E\r\n"
            + "          E\r\n"
            + "          E\r\n"
            + "          I\r\n"
            + "            E\r\n"
            + "            E\r\n"
            + "            E\r\n"
            + "            I\r\n"
            + "              I\r\n"
            + "                E\r\n"
            + "                I\r\n"
            + "                  I\r\n"
            + "                    E\r\n"
            + "                    E\r\n"
            + "                    E\r\n"
            + "                    I\r\n"
            + "                      E\r\n"
            + "                      E\r\n"
            + "                      TCTTTTACATGAGAT\r\n"
            + "                      TCTTTTACATTTT\r\n"
            + "                      E\r\n"
            + "                    E\r\n"
            + "                  E\r\n"
            + "                  E\r\n"
            + "                  E\r\n"
            + "                  E\r\n"
            + "                E\r\n"
            + "                E\r\n"
            + "                E\r\n"
            + "              E\r\n"
            + "              E\r\n"
            + "              E\r\n"
            + "              E\r\n"
            + "            E\r\n"
            + "          E\r\n"
            + "        E\r\n"
            + "      E\r\n"
            + "    E\r\n"
            + "    TTTAAGTACATTTGA\r\n"
            + "    T\r\n"
            + "  E";
        console = systemOut().getHistory();
        assertFuzzyEquals(console, output);
        
        
        /*
        // FW -> leaf
        leaf2 = leaf2.insert("A", 0);

        assertFuzzyEquals("sequence A inserted at level 0", systemOut()
            .getHistory());
        systemOut().clearHistory();

        // already exists (nothing changes)
        leaf2 = leaf2.insert("A", 0);

        assertFuzzyEquals("sequence A already exists", systemOut()
            .getHistory());
        systemOut().clearHistory();

        leaf2 = leaf2.insert("C", 0);

        assertFuzzyEquals("sequence C inserted at level 1", systemOut()
            .getHistory());
        systemOut().clearHistory();

        leaf2 = leaf2.insert("G", 0);

        assertFuzzyEquals("sequence G inserted at level 1", systemOut()
            .getHistory());
        systemOut().clearHistory();

        leaf2 = leaf2.insert("T", 0);

        assertFuzzyEquals("sequence T inserted at level 1", systemOut()
            .getHistory());
        systemOut().clearHistory();

        leaf2 = leaf2.insert("AA", 0);

        assertFuzzyEquals("sequence AA inserted at level 2", systemOut()
            .getHistory());
        systemOut().clearHistory();
        
        leaf2 = leaf2.insert("CC", 0);

        assertFuzzyEquals("sequence CC inserted at level 2", systemOut()
            .getHistory());
        systemOut().clearHistory();
        
        leaf2 = leaf2.insert("GGTGT", 0);

        assertFuzzyEquals("sequence GGTGT inserted at level 2", systemOut()
            .getHistory());
        systemOut().clearHistory();
        
        leaf2 = leaf2.insert("TGTGT", 0);

        assertFuzzyEquals("sequence TGTGT inserted at level 2", systemOut()
            .getHistory());
        systemOut().clearHistory();
        
        leaf2.print(0, "");
        */
    }


    /**
     * Test the search method.
     */
    public void testSearch() {
        leaf.search("AC", 0);
        assertFuzzyEquals("sequence: ACGT", systemOut().getHistory());
        systemOut().clearHistory();

        leaf.search("ACGT$", 0);
        assertFuzzyEquals("sequence: ACGT", systemOut().getHistory());
        systemOut().clearHistory();

        leaf.search("AAAA", 0);
        assertFuzzyEquals("no sequence found", systemOut().getHistory());
        systemOut().clearHistory();
    }


    /**
     * test the remove method
     */
    public void testRemove() {
        leaf.remove("ACGT", 0);
        assertFuzzyEquals("sequence ACGT removed", systemOut().getHistory());
        systemOut().clearHistory();

        leaf.remove("AAAA", 0);
        assertFuzzyEquals("sequence AAAA does not exist", systemOut()
            .getHistory());
        systemOut().clearHistory();
    }


    /**
     * Test the Number Of Node Visited
     */
    public void testNumOfNodeVisited() {
        assertEquals(1, leaf.numOfNodeVisited("ACGT", 0));
    }
}
