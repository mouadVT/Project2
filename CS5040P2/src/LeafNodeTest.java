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
     * Tests getSeq() method.
     */
    public void testGetSeq() {
        String seq = leaf.getSeq();
        assertEquals(seq, leaf.getSeq());
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
        leaf2 = new flyweightnode();
        //leaf2.print(0, "");
        
        // FW -> leaf
        leaf2 = leaf2.insert("ACGT", 0);
        //leaf2.print(0, "");
        
        //already exists (nothing changes)
        leaf2 = leaf2.insert("ACGTA", 0);
        leaf2.print(0, "");
        
        // PROBLEMS:
        // if 2 or more consecutive chars, too many internal nodes
        // also if second insert is bigger than first and same letters
        
        // leaf -> internal
        //leaf2 = leaf2.insert("AAAA", 0);
        //leaf2.print(0, "");

        //assertEquals("AAAA", ((LeafNode)((Internalnode)((Internalnode)leaf2).getChild('A')).getChild('A')).getSeq());
        //assertEquals("ACGT", ((LeafNode)((Internalnode)((Internalnode)leaf2).getChild('A')).getChild('C')).getSeq());
        
        //leaf2 = leaf2.insert("AA", 0);
        //leaf2.print(0, "");

        
        //leaf2 = leaf2.insert("AAACCCCGGTGAAAACGTA", 0);
        //leaf2.print(0, "");
    }
}
