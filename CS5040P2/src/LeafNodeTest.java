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
    private String seq = "ACGT";
    
    /**
     * Sets up each test method.
     */
    public void setUp() {
        
        
        leaf = new LeafNode(seq, 0);
    }
    
    
    /**
     * Tests getSeq() method.
     */
    public void testGetSeq() {
        String seq = leaf.getSeq();
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
        assertEquals("ACGT", leaf.print());
    }
}
