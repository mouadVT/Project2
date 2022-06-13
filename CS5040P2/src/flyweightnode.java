/**
 * flyweightnode class.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class flyweightnode extends Baseclass {
    
    private Baseclass fw;
    
    /**
     * Default constructor.
     */
    public flyweightnode() {
        //empty
    }

    
    /**
     * Inserts sequence into empty leaf node
     * and converts flyweight into leaf node.
     * 
     * @param seq (String of DNA sequence)
     * @param depth (depth/level of node)
     */
    @Override
    public Baseclass insert(String seq, int depth) {
        fw = new LeafNode(seq, depth);
        System.out.println("sequence " + seq + " inserted at level " + depth);
        return fw;
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
