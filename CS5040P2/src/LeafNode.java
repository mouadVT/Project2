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
    private Baseclass intNode;
    private int depth;
    private int level;
    
    /**
     * LeafNode constructor.
     */
    public LeafNode(String seq, int d) {
        this.data = seq;
        this.level = d;
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
        
        intNode = new Internalnode();
        
        // new sequence being inserted
        Internalnode intNode2 = (Internalnode)intNode.insert(seq, d);
        
        // original leaf node becomes child
        if (data.charAt(level) == 'A') {
            ((Internalnode)intNode2).setTheLeafNode(data, level, 'A');
        }
        else if (data.charAt(level) == 'C') {
            ((Internalnode)intNode2).setTheLeafNode(data, level, 'C');
        }
        else if (data.charAt(level) == 'G') {
            ((Internalnode)intNode2).setTheLeafNode(data, level, 'G');
        }
        else if (data.charAt(level) == 'T') {
            ((Internalnode)intNode2).setTheLeafNode(data, level, 'T');
        }
        else {
            ((Internalnode)intNode2).setTheLeafNode(data, level, '$');
        }
        
        return intNode2;
    }


    /**
     * Prints out DNA sequence of leaf node.
     */
    @Override
    public String print(int depth) {
        String st0 = "";
        String st1 = data;
        for (int i = 0; i < depth; i++) {
            st0 += " ";
        }
        System.out.println(st0 + st1);
        return st0 + st1;
    }


    /**
     * Finds all sequences that match the given sequence.
     */
    @Override
    public void search(String seq, int depth) {
        // TODO Auto-generated method stub
    }


    /**
     * Removes a sequence from the tree.
     */
    @Override
    public Baseclass remove(String seq, int depth) {
        // TODO Auto-generated method stub
        return intNode;
    }
}
