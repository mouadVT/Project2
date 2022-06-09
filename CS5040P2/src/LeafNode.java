// James

/**
 * LeafNode class.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class LeafNode implements Baseclass {
    
    private Linkedlist<String> data;
    
    /**
     * LeafNode constructor.
     */
    public LeafNode(Linkedlist<String> seq) {
        this.data = seq;
    }
    
    
    /**
     * Returns data (sequence) in node.
     */
    public Linkedlist<String> getSeq() {
        return data;
    }
    
    
    /**
     * Inserts sequence into leaf node
     * and converts leaf node into internal node.
     * 
     * @param seq (Linked list of DNA sequence)
     */
    @Override
    public void insert(Linkedlist<String> seq) {
        Linkedlist<String> data = getSeq();
        
        // sequence already exists
        if (seq == data) {
            System.out.println("Sequence " + data.toString() + " already exists");
        }
        else {
          //Internalnode intNode = new InternalNode();
        }
    }


    /**
     * Prints out DNA sequence of leaf node.
     */
    @Override
    public void print() {
        
    }


    /**
     * 
     */
    @Override
    public void search() {
     // TODO Auto-generated method stub
    }


    /**
     * 
     */
    @Override
    public void remove() {
     // TODO Auto-generated method stub
    }
}
