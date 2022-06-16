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
    public Baseclass insert(String seq, int level) {
        
        // sequence already exists
        if (seq.equals(data)) {
            System.out.println("sequence " + data + " already exists");
            return this;
        }
        else {
            intNode = new Internalnode();
            
            // change the original leaf node to becomes a child
            if (data.charAt(level) == 'A') {
                ((Internalnode)intNode).setTheLeafNode(data, level, 'A');
            }
            else if (data.charAt(level) == 'C') {
                ((Internalnode)intNode).setTheLeafNode(data, level, 'C');
            }
            else if (data.charAt(level) == 'G') {
                ((Internalnode)intNode).setTheLeafNode(data, level, 'G');
            }
            else if (data.charAt(level) == 'T') {
                ((Internalnode)intNode).setTheLeafNode(data, level, 'T');
            }
            else {
                ((Internalnode)intNode).setTheLeafNode(data, level, '$');
            }
            
            // insert new sequence
            return (Internalnode)intNode.insert(seq, level);
        }
    }


    /**
     * Prints out DNA sequence of leaf node.
     */
    @Override
    public void print(int depth, String entry) {
        if (entry.equals("lengths")) {
            String st0 = "";
            String st1 = data;
            for (int i = 0; i < depth; i++) {
                st0 += " ";
            }
            System.out.println(st0 + st1 + " " + data.length());
        }
        else if (entry.equals("stats")) {
            String st0 = "";
            String st1 = data;
            for (int i = 0; i < depth; i++) {
                st0 += " ";
            }
            System.out.println(st0 + st1 + this.sequenceStats(data));
        }
        else {
            String st0 = "";
            String st1 = data;
            for (int i = 0; i < depth; i++) {
                st0 += " ";
            }
            System.out.println(st0 + st1);
        }
    }


    /**
     * Finds all sequences that match the given sequence.
     */
    @Override
    public void search(String seq, int level) {
        int visited = 0;
        boolean dollar = false;
        
        //checks if sequence has $
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '$') {
                dollar = true;
            }
        }
        
        if (dollar == true) {
            // sequence found
            if (seq.equals(this.getSeq())) {
                System.out.println("# of nodes visited: " + visited);
                System.out.println("sequence: " + seq);
            }
            else {
                intNode = new Internalnode();
                
                if (seq.charAt(level) == 'A') {
                    //Baseclass child = ((Internalnode)intNode).getChild('A');
                    if (((LeafNode)((Internalnode)intNode).getLeaf()).getSeq().length() > 0) {
                        visited += 1;
                    }
                    
                    intNode.search(seq, level);
                }
                else if (seq.charAt(level) == 'C') {
                    //Baseclass child = ((Internalnode)intNode).getChild('C');
                    if (((LeafNode)((Internalnode)intNode).getLeaf()).getSeq().length() > 0) {
                        visited += 1;
                    }
                    
                    intNode.search(seq, level);
                }
                else if (seq.charAt(level) == 'G') {
                    //Baseclass child = ((Internalnode)intNode).getChild('G');
                    if (((LeafNode)((Internalnode)intNode).getLeaf()).getSeq().length() > 0) {
                        visited += 1;
                    }
                    
                    intNode.search(seq, level);
                }
                else if (seq.charAt(level) == 'T') {
                    //Baseclass child = ((Internalnode)intNode).getChild('T');
                    if (((LeafNode)((Internalnode)intNode).getLeaf()).getSeq().length() > 0) {
                        visited += 1;
                    }
                    
                    intNode.search(seq, level);
                }
            }
        }
        else {
            //if dollar == false
        }
    }


    /**
     * Removes a sequence from the tree.
     */
    @Override
    public Baseclass remove(String seq, int depth) {
        Baseclass flyNode = new flyweightnode();
        if (!data.equals(seq)) {
            System.out.println("Sequence " + seq + " does not exist");
            return this;
        }
        System.out.println("Sequence " + seq + " removed");
        return flyNode;
    }
    
    
    public String sequenceStats(String seq) {
        double a = 0;
        double c = 0;
        double g = 0;
        double t = 0;
        
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == 'A') {
                a += 1;
            }
            
            if (seq.charAt(i) == 'C') {
                c += 1;
            }
            
            if (seq.charAt(i) == 'G') {
                g += 1;
            }
            
            if (seq.charAt(i) == 'T') {
                t += 1;
            }
        }
        String a2 = String.format("%.2f", (a / seq.length()) * 100);
        String c2 = String.format("%.2f", (c / seq.length()) * 100);
        String g2 = String.format("%.2f", (g / seq.length()) * 100);
        String t2 = String.format("%.2f", (t / seq.length()) * 100);
        
        return " A:" + a2 + " C:" + c2 + " G:" + g2 + " T:" + t2 + " ";
    }
}
