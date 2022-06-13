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
        assertEquals("ACGT", leaf.print());
    }
    
    
    /**
     * Tests insert() method.
     */
    public void testInsert() {      
        leaf2 = new flyweightnode();
        assertEquals("E", leaf2.print());
        
        leaf2 = leaf2.insert("ACGT", 0);
        assertEquals("ACGT", leaf2.print());
        
        //already exists (nothing changes)
        leaf2 = leaf2.insert("ACGT", 0);
        assertEquals("ACGT", leaf2.print());
        
        leaf2 = leaf2.insert("AAAA", 2);
        assertEquals("I", leaf2.print());
        
        Baseclass parent = leaf2;

        assertEquals("AAAA", ((LeafNode)((Internalnode)leaf2).getChild('A')).getSeq());
        assertEquals("ACGT", ((LeafNode)((Internalnode)leaf2).getChild('C')).getSeq());
        
        leaf2 = leaf2.insert("AA", 3);
        assertEquals("AA", leaf2.print());
        
        assertEquals("AA", ((LeafNode)((Internalnode)parent).getChild('$')).getSeq());
        assertEquals("AAAA", ((LeafNode)((Internalnode)parent).getChild('A')).getSeq());
        
        //leaf2 = leaf2.insert("AAACCCCGGTGAAAACGTA", 4);
        //assertEquals("I", leaf2.print());
        
        //assertEquals("AAAA", ((LeafNode)((Internalnode)leaf2).getChild('A')).getSeq());
        //assertEquals("AAACCCCGGTGAAAACGTA", ((LeafNode)((Internalnode)leaf2).getChild('C')).getSeq());
    }
}
