import student.TestCase;

public class NodeTest extends TestCase {
    
   private Node<String> node;
    /**
     * setUp method 
     */
    public void setUp() {
        node = new Node<String>("A");
        
    }
    /**
     * 
     */
    public void testGetData() {
        String st = node.getData();
        assertTrue(st.equals("A"));
        
    }
} 
