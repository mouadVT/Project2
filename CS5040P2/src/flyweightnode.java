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
    public void print(int depth, String entry) {
        String st0 = "";
        String st1 = "E";
        for (int i = 0; i < depth; i++) {
            st0 += "  ";
        }
        System.out.println(st0 + st1);
    }


    /**
     * Finds all sequences that match the given sequence.
     */
    @Override
    public void search(String seq, int depth) {
        System.out.println("no sequence found");
    }


    /**
     * Removes a sequence from the tree.
     */
    @Override
    public Baseclass remove(String seq, int depth) {
        System.out.println("sequence " + seq + " does not exist");
        return this;
    }
    
    
    /**
     * Returns number of nodes visited.
     * 
     * @param entry
     * @param depth
     * @return integer
     */
    public int numOfNodeVisited(String entry, int depth) {
        return 1;
    }
}
