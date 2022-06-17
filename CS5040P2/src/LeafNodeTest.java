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
    private Baseclass leaf2;

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
        assertEquals(" A:25.00 C:25.00 G:25.00 T:25.00", ((LeafNode)leaf).sequenceStats("ACGT"));
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
        assertFuzzyEquals("I\r\n"
            + "  I\r\n"
            + "    AAAA 4\r\n"
            + "    ACGT 4\r\n"
            + "    E\r\n"
            + "    E\r\n"
            + "    E\r\n"
            + "  E\r\n"
            + "  E\r\n"
            + "  E\r\n"
            + "  E", systemOut().getHistory());
        systemOut().clearHistory();
        
        leaf.print(0, "stats");
        assertFuzzyEquals("I\r\n"
            + "  I\r\n"
            + "    AAAA A:100.00 C:0.00 G:0.00 T:0.00\r\n"
            + "    ACGT A:25.00 C:25.00 G:25.00 T:25.00\r\n"
            + "    E\r\n"
            + "    E\r\n"
            + "    E\r\n"
            + "  E\r\n"
            + "  E\r\n"
            + "  E\r\n"
            + "  E", systemOut().getHistory());
        systemOut().clearHistory();
    }


    /**
     * Tests insert() method.
     */
    public void testInsert() {
        leaf2 = new FlyWeightNode();
        
        /*
        leaf2 = leaf2.insert("A", 0);
        leaf2 = leaf2.insert("G", 0);
        leaf2 = leaf2.insert("T", 0);
        leaf2 = leaf2.insert("C", 0);
        leaf2 = leaf2.insert("AA", 0);
        leaf2 = leaf2.insert("AG", 0);
        leaf2 = leaf2.insert("AT", 0);
        leaf2 = leaf2.insert("AC", 0);
        leaf2 = leaf2.insert("AGC", 0);
        
        leaf2.print(0, "");
        */
        
      
        // FW -> leaf
        leaf2 = leaf2.insert("A", 0);
        leaf2 = leaf2.remove("A", 0);
        leaf2.print(0, "");
        leaf2 = leaf2.insert("GAT", 0);
        leaf2 = leaf2.insert("ACG", 0);
        leaf2 = leaf2.insert("GTA", 0);
        leaf2 = leaf2.insert("GCAT", 0);
        leaf2 = leaf2.insert("G", 0);
        leaf2 = leaf2.remove("G", 0);
        leaf2 = leaf2.remove("G", 0);
        leaf2.print(0, "");
        leaf2 = leaf2.remove("GGCT", 0);
        leaf2 = leaf2.remove("GCAA", 0);
        leaf2 = leaf2.remove("GAT", 0);
        leaf2 = leaf2.remove("GTA", 0);
        leaf2.print(0, "");
        
        
        //assertFuzzyEquals("sequence ACGT inserted at level 0", systemOut().getHistory());
        //systemOut().clearHistory();

        // already exists (nothing changes)
        //leaf2 = leaf2.insert("ACGT", 0);
        //leaf2.print(0, "");
        
        //assertFuzzyEquals("sequence ACGT already exists", systemOut().getHistory());
        //systemOut().clearHistory();

        // leaf -> internal
        //leaf2 = leaf2.insert("AAAA", 0);
        //leaf2.print(0, "");
        
        //assertFuzzyEquals("sequence AAAA inserted at level 2", systemOut().getHistory());
        //systemOut().clearHistory();

        //leaf2 = leaf2.insert("AA", 0);
        //leaf2.print(0, "");
        
        //assertFuzzyEquals("sequence AA inserted at level 3", systemOut().getHistory());
        //systemOut().clearHistory();

        //leaf2 = leaf2.insert("AAACCCCGGTGAAAACGTA", 0);
        //leaf2.print(0, "");
        
        //assertFuzzyEquals("sequence AAACCCCGGTGAAAACGTA inserted at level 4", systemOut().getHistory());
        //systemOut().clearHistory();
        
        //leaf2 = leaf2.insert("ACTGGGAA", 0);
        //leaf2.print(0, "");
        
        //assertFuzzyEquals("sequence ACTGGGAA inserted at level 3", systemOut().getHistory());
        //systemOut().clearHistory();
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
        assertFuzzyEquals("sequence AAAA does not exist", systemOut().getHistory());
        systemOut().clearHistory();
    }


    /**
     * Test the Number Of Node Visited
     */
    public void testNumOfNodeVisited() {
        assertEquals(1, leaf.numOfNodeVisited("ACGT", 0));
    }
}
