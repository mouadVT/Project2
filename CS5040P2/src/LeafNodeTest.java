import student.TestCase;

/**
 * Tests LeafNode methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class LeafNodeTest extends TestCase {

    private LeafNode leaf;
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

    }


    /**
     * Tests print() method.
     */
    public void testPrint() {
        System.out.println(leaf.sequenceStats("GCT"));
    }


    /**
     * Tests insert() method.
     */
    public void testInsert() {
        leaf2 = new LeafNode("A", 0);
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
       // leaf2 = new FlyWeightNode();
        // leaf2.print(0, "");

        // FW -> leaf
       // leaf2 = leaf2.insert("ACGT", 0);
        // leaf2.print(0, "");

        // already exists (nothing changes)
       // leaf2 = leaf2.insert("ACGTA", 0);
        //leaf2.print(0, "");

        // PROBLEMS:
        // if 2 or more consecutive chars, too many internal nodes
        // also if second insert is bigger than first and same letters

        // leaf -> internal
        // leaf2 = leaf2.insert("AAAA", 0);
        // leaf2.print(0, "");

        // assertEquals("AAAA",
        // ((LeafNode)((Internalnode)((Internalnode)leaf2).getChild('A')).getChild('A')).getSeq());
        // assertEquals("ACGT",
        // ((LeafNode)((Internalnode)((Internalnode)leaf2).getChild('A')).getChild('C')).getSeq());

        // leaf2 = leaf2.insert("AA", 0);
        // leaf2.print(0, "");

        // leaf2 = leaf2.insert("AAACCCCGGTGAAAACGTA", 0);
        // leaf2.print(0, "");
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
