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
    private Linkedlist<String> seq;
    
    /**
     * Sets up each test method.
     */
    public void setUp() {
        
        
        leaf = new LeafNode(seq);
    }
    
    
    /**
     * Tests getSeq() method.
     */
    public void testGetSeq() {
        Linkedlist<String> seq = leaf.getSeq();
        assertEquals(seq, leaf.getSeq());
    }
    
    
    /**
     * Tests insert() method.
     */
    public void testInsert() {
        // TODO
    }
    
    
    /**
     * Tests print() method.
     */
    public void testPrint() {
        // maybe have Baseclass print() return String or LList?
        
        //assertEquals("ACGT", leaf.print());
    }
}
