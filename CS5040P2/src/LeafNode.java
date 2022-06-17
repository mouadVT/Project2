/**
 * The DNA sequences stored in the leaf nodes may be implemented using a linked
 * list
 * LeafNode class.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class LeafNode extends Baseclass {

    private String data;
    private Baseclass intNode;

    /**
     * leaf constructor
     * 
     * @param seq
     *            (String for DNA sequence)
     * @param d
     *            (depth/level of node)
     */
    public LeafNode(String seq, int d) {
        this.data = seq;
    }


    /**
     * Inserts sequence into leaf node
     * and converts leaf node into internal node.
     * 
     * @param seq
     *            (String of DNA sequence)
     * @param level
     *            (depth/level of new node)
     * @return leaf the node with data
     */
    @Override
    public Baseclass insert(String seq, int level) {
        if (seq.equals(data)) {
            System.out.println("sequence " + data + " already exists");
            return this;
        }
        else {
            intNode = new Internalnode();
            if (level < data.length()) {
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
            }
            return (Internalnode)intNode.insert(seq, level);
        }
    }


    /**
     * prints the tree in tree moods
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of new node)
     */
    @Override
    public void print(int depth, String entry) {
        if (entry.equals("lengths")) {
            String st0 = "";
            String st1 = data;
            for (int i = 0; i < depth; i++) {
                st0 += "  ";
            }
            System.out.println(st0 + st1 + " " + data.length());
        }
        else if (entry.equals("stats")) {
            String st0 = "";
            String st1 = data;
            for (int i = 0; i < depth; i++) {
                st0 += "  ";
            }
            System.out.println(st0 + st1 + this.sequenceStats(data));
        }
        else {
            String st0 = "";
            String st1 = data;
            for (int i = 0; i < depth; i++) {
                st0 += "  ";
            }
            System.out.println(st0 + st1);
        }
    }


    /**
     * Finds all sequences that match the given sequence.
     * 
     * @param seq
     *            (String of DNA sequence)
     * @param level
     *            (depth/level of new node)
     */
    @Override
    public void search(String seq, int level) {
        intNode = new Internalnode();

        if (seq.charAt(seq.length() - 1) == '$' && seq.substring(0, seq.length()
            - 1).equals(data)) {
            System.out.println("sequence: " + seq.substring(0, seq.length()
                - 1));
        }
        else if (seq.length() <= data.length() && data.substring(0, seq
            .length()).equals(seq)) {
            System.out.println("sequence: " + data);
        }
        else {
            System.out.println("no sequence found");
        }
    }


    /**
     * Removes a sequence from the tree.
     * 
     * @param seq
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of new node)
     */
    @Override
    public Baseclass remove(String seq, int depth) {
        Baseclass flyNode = new FlyWeightNode();
        if (!data.equals(seq)) {
            System.out.println("Sequence " + seq + " does not exist");
            return this;
        }
        System.out.println("Sequence " + seq + " removed");
        return flyNode;
    }


    /**
     * this method to provide the sequence status
     * 
     * @param seq
     *            (String of DNA sequence)
     * @return string that has the state of the sequence
     */
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


    /**
     * returns number of nodes for the leaf node
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of new node)
     * @return number of nodes visited
     */
    public int numOfNodeVisited(String entry, int depth) {
        return 1;
    }
}
