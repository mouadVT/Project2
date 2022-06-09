//Mouad

import student.TestCase;

public class LinkedlistTest extends TestCase {
    
   private Linkedlist<String> list;
    /**
     * setUp method 
     */
    public void setUp() {
        list = new Linkedlist<String>("A");
        
    }
    /**
     * 
     */
    public void testGetData() {
        String st = list.getData();
        assertTrue(st.equals("A"));
        
    }
} 
