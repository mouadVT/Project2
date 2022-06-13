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
    
    /**
     * LeafNode constructor.
     */
    public LeafNode(String seq, int d) {
        this.data = seq;
    }
    
    
    /**
     * Returns data (sequence) in node.
     */
    public String getSeq() {
        return data;
    }
    
    
    /**
     * Returns depth of node.
     */
    //public int getDepth() {
    //    return depth;
    //}
    
    
    /**
     * Sets depth of leaf node.
     */
    //public void setDepth(int d) {
    //    depth = d;
    //}
    
    
    /**
     * Inserts sequence into leaf node
     * and converts leaf node into internal node.
     * 
     * @param seq (String of DNA sequence)
     */
    @Override
    public Baseclass insert(String seq, int depth) {
        //String data = getSeq();
        //int origDepth = getDepth();
        
        // sequence already exists
        if (seq.equals(data)) {
            System.out.println("Sequence " + data + " already exists");
        }
        else {
            //Internalnode intNode = new Internalnode();
            
            // new sequence being inserted
            //intNode.insert(seq, depth + 1);
            // original leaf node moves down
            //intNode.insert(data, depth + 1);
            
            System.out.println("sequence " + seq + " inserted at level " + depth);
        }
        
        return leaf = insert(seq, depth);
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
