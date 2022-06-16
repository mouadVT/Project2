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
        assertEquals("ACGT", leaf.print(0));
    }
    
    
    /**
     * Tests insert() method.
     */
    public void testInsert() {      
        leaf2 = new flyweightnode();
        assertEquals("E", leaf2.print(0));
        
        // FW -> leaf
        leaf2 = leaf2.insert("ACGT", 0);
        assertEquals("ACGT", leaf2.print(0));
        
        //already exists (nothing changes)
        //leaf2 = leaf2.insert("ACGT", 0);
        //assertEquals("ACGT", leaf2.print(0));
        
        // leaf -> internal
        leaf2 = leaf2.insert("AGAA", 0);
        assertEquals("I", leaf2.print(0));
        
        //Baseclass parent = leaf2;

        //assertEquals("ACGT", ((LeafNode)((Internalnode)leaf2).getChild('A')).getSeq());
        //assertEquals("AGTA", ((LeafNode)((Internalnode)leaf2).getChild('G')).getSeq());
        
        //leaf2 = leaf2.insert("AA", 3);
        //assertEquals("AA", leaf2.print());
        
        //assertEquals("AA", ((LeafNode)((Internalnode)parent).getChild('$')).getSeq());
        //assertEquals("AAAA", ((LeafNode)((Internalnode)parent).getChild('A')).getSeq());
        
        //leaf2 = leaf2.insert("AAACCCCGGTGAAAACGTA", 4);
        //assertEquals("I", leaf2.print());
        
        //assertEquals("AAAA", ((LeafNode)((Internalnode)leaf2).getChild('A')).getSeq());
        //assertEquals("AAACCCCGGTGAAAACGTA", ((LeafNode)((Internalnode)leaf2).getChild('C')).getSeq());
    }
}
