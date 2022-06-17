/**
 * Internalnode class.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class Internalnode extends Baseclass {

    private Baseclass a;
    private Baseclass c;
    private Baseclass g;
    private Baseclass t;
    private Baseclass dollar;

    /**
     * Default constructor.
     */
    public Internalnode() {
        this.a = new FlyWeightNode();
        this.c = new FlyWeightNode();
        this.g = new FlyWeightNode();
        this.t = new FlyWeightNode();
        this.dollar = new FlyWeightNode();
    }


    /**
     * Returns child node.
     * 
     * @param dna
     *            (char)
     * @return child node
     */
    public Baseclass getChild(char dna) {
        if (dna == 'A') {
            return a;
        }
        else if (dna == 'C') {
            return c;
        }
        else if (dna == 'G') {
            return g;
        }
        else if (dna == 'T') {
            return t;
        }
        else if (dna == '$') {
            return dollar;
        }
        return dollar;
    }


    /**
     * Returns child if it is a leaf node.
     * 
     * @return leaf node
     */
    public Baseclass getLeaf() {
        if (a instanceof LeafNode) {
            return a;
        }
        else if (c instanceof LeafNode) {
            return c;
        }
        else if (g instanceof LeafNode) {
            return g;
        }
        else if (t instanceof LeafNode) {
            return t;
        }
        return t;
    }


    /**
     * Inserts sequence into internal node.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     * @return internal node
     */
    @Override
    public Baseclass insert(String entry, int depth) {
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a = a.insert(entry, depth + 1);
            }
            else if (entry.charAt(depth) == 'C') {
                c = c.insert(entry, depth + 1);
            }
            else if (entry.charAt(depth) == 'G') {
                g = g.insert(entry, depth + 1);
            }
            else {
                t = t.insert(entry, depth + 1);
            }
            return this;
        }
        dollar = dollar.insert(entry, depth + 1);
        return this;
    }


    /**
     * Prints out "I" for internal node.
     * 
     * @param depth
     *            (depth/level of node)
     * @param entry
     *            (String of DNA sequence)
     */
    @Override
    public void print(int depth, String entry) {
        String st0 = "";
        String st1 = "I";
        for (int i = 0; i < depth; i++) {
            st0 += " ";
        }
        System.out.println(st0 + st1);
        a.print(depth + 1, entry);
        c.print(depth + 1, entry);
        g.print(depth + 1, entry);
        t.print(depth + 1, entry);
        dollar.print(depth + 1, entry);
    }


    /**
     * Finds all sequences that match the given sequence.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     */
    @Override
    public void search(String entry, int depth) {
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a.search(entry, depth + 1);
            }
            else if (entry.charAt(depth) == 'C') {
                c.search(entry, depth + 1);
            }
            else if (entry.charAt(depth) == 'G') {
                g.search(entry, depth + 1);
            }
            else if (entry.charAt(depth) == 'T') {
                t.search(entry, depth + 1);
            }
            else {
                dollar.search(entry, depth);
            }
        }
        else {
            if (!(a instanceof FlyWeightNode)) {
                a.search(entry, depth + 1);
            }
            if (!(c instanceof FlyWeightNode)) {
                c.search(entry, depth + 1);
            }
            if (!(g instanceof FlyWeightNode)) {
                g.search(entry, depth + 1);
            }
            if (!(t instanceof FlyWeightNode)) {
                t.search(entry, depth + 1);
            }
            if (!(dollar instanceof FlyWeightNode)) {
                dollar.search(entry, depth + 1);
            }
        }
    }


    /**
     * Removes a sequence from the tree.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     * @return removed node
     */
    @Override
    public Baseclass remove(String entry, int depth) {
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a = a.remove(entry, ++depth);
            }
            else if (entry.charAt(depth) == 'C') {
                c = c.remove(entry, ++depth);
            }
            else if (entry.charAt(depth) == 'G') {
                g = g.remove(entry, ++depth);
            }
            else {
                t = t.remove(entry, ++depth);
            }
            return this.returnLeafNode();
        }
        dollar = dollar.remove(entry, depth);
        return this.returnLeafNode();
    }


    /**
     * Sets data of leaf node.
     * 
     * @param sequence
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     * @param index
     *            (char)
     */
    public void setTheLeafNode(String sequence, int depth, char index) {

        switch (index) {
            case 'A':
                this.a = new LeafNode(sequence, depth);
                break;
            case 'C':
                this.c = new LeafNode(sequence, depth);
                break;
            case 'G':
                this.g = new LeafNode(sequence, depth);
                break;
            case 'T':
                this.t = new LeafNode(sequence, depth);
                break;
            default:
                this.dollar = new LeafNode(sequence, depth);
                break;
        }
    }


    /**
     * Counts number of nodes visited.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     * @return total number of visited nodes
     */
    public int numOfNodeVisited(String entry, int depth) {
        if (depth < entry.length()) {
            char character = entry.charAt(depth);
            switch (character) {
                case 'A':
                    return 1 + a.numOfNodeVisited(entry, depth + 1);
                case 'C':
                    return 1 + c.numOfNodeVisited(entry, depth + 1);
                case 'G':
                    return 1 + g.numOfNodeVisited(entry, depth + 1);
                case 'T':
                    return 1 + t.numOfNodeVisited(entry, depth + 1);
                default:
                    return 1 + dollar.numOfNodeVisited(entry, depth + 1);
            }
        }
        return 1 + a.numOfNodeVisited(entry, depth + 1) + c.numOfNodeVisited(
            entry, depth + 1) + g.numOfNodeVisited(entry, depth + 1) + t
                .numOfNodeVisited(entry, depth + 1) + dollar.numOfNodeVisited(
                    entry, depth + 1);
    }


    /**
     * Returns leaf node.
     * 
     * @return leaf node
     */
    private Baseclass returnLeafNode() {
        boolean aLeaf = a instanceof LeafNode;
        boolean cLeaf = c instanceof LeafNode;
        boolean gLeaf = g instanceof LeafNode;
        boolean tLeaf = t instanceof LeafNode;
        boolean dollarLeaf = dollar instanceof LeafNode;
        if (this.numOfFlyNodes() == 4 && this.numOfLeafNodes() == 1) {
            if (aLeaf) {
                return a;
            }
            if (cLeaf) {
                return c;
            }
            if (gLeaf) {
                return g;
            }
            if (tLeaf) {
                return t;
            }
            if (dollarLeaf) {
                return dollar;
            }
        }
        return this;
    }


    /**
     * Counts number of flyweight nodes.
     * 
     * @return number of flyweight nodes
     */
    private int numOfFlyNodes() {
        FlyWeightNode flw = new FlyWeightNode();
        return Boolean.compare(a.equals(flw), false) + Boolean.compare(c.equals(
            flw), false) + Boolean.compare(g.equals(flw), false) + Boolean
                .compare(t.equals(flw), false) + Boolean.compare(dollar.equals(
                    flw), false);
    }


    /**
     * Counts number of leaf nodes.
     * 
     * @return number of leaf nodes
     */
    private int numOfLeafNodes() {
        boolean aLeaf = a instanceof LeafNode;
        boolean cLeaf = c instanceof LeafNode;
        boolean gLeaf = g instanceof LeafNode;
        boolean tLeaf = t instanceof LeafNode;
        boolean dollarLeaf = dollar instanceof LeafNode;

        return Boolean.compare(aLeaf, false) + Boolean.compare(cLeaf, false)
            + Boolean.compare(gLeaf, false) + Boolean.compare(tLeaf, false)
            + Boolean.compare(dollarLeaf, false);
    }
}
