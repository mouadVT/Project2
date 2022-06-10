// James

/**
 * flyweightnode class.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class flyweightnode implements Baseclass {
    
    private static flyweightnode fw; //maybe initialize in DNAtree?
    
    /**
     * Default constructor.
     */
    public flyweightnode() {
        
    }

    
    /**
     * Inserts sequence into empty leaf node
     * and converts flyweight into leaf node.
     * 
     * @param seq (Linked list of DNA sequence)
     */
    @Override
    public void insert(String seq, int depth) {
        LeafNode leaf = new LeafNode(seq, depth);
        System.out.println("sequence " + seq + " inserted at level " + depth);
    }


    /**
     * Prints out "E" for empty leaf node.
     */
    @Override
    public String print() {
        System.out.println("E");
        return "E";
    }


    /**
     * Finds all sequences that match the given sequence.
     */
    @Override
    public void search(String seq) {
        // TODO Auto-generated method stub
    }


    /**
     * Removes a sequence from the tree.
     */
    @Override
    public String remove(String seq) {
        // TODO Auto-generated method stub
        return seq;
    }
}
