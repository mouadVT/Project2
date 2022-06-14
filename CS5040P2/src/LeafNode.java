/**
 *  The DNA sequences stored in the leaf nodes may be implemented using a linked list
 * LeafNode class.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class LeafNode extends Baseclass {
    
    private String data;
    private Baseclass leaf;
    private int depth;
    
    /**
     * LeafNode constructor.
     */
    public LeafNode(String seq /**, int d*/) {
        this.data = seq;
        ///this.depth = d;
    }
    
    
    /**
     * Returns data (sequence) in node.
     */
    public String getSeq() {
        return data;
    }
    
    
    /**
     * Inserts sequence into leaf node
     * and converts leaf node into internal node.
     * 
     * @param seq (String of DNA sequence)
     * @param d (depth/level of new node)
     */
    @Override
    public Baseclass insert(String seq, int d) {        
        // sequence already exists
        if (seq.equals(data)) {
            System.out.println("sequence " + data + " already exists");
            return this;
        }
        
        leaf = new Internalnode();
        
        // new sequence being inserted
        leaf.insert(seq, d + 1);
        
        // original leaf node becomes child
        leaf.insert(data, depth + 1);
        
        System.out.println("sequence " + seq + " inserted at level " + d);
        return leaf;
    }


    /**
     * Prints out DNA sequence of leaf node.
     */
    @Override
    public String print() {
        System.out.println(data);
        return data;
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
