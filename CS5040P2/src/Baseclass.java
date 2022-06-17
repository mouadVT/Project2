/**
 * DNA tree node abstract class that defines operations for nodes.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public abstract class Baseclass {
    /**
     * Inserts sequence into tree node.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     * @return node type after insertion
     */
    public abstract Baseclass insert(String entry, int depth);

    
    
    /**
     * Prints out DNA tree.
     * 
     * @param depth
     *            (depth/level of node)
     * @param entry
     *            (String of DNA sequence)
     */
    public abstract void print(int depth, String entry);

    

    /**
     * Finds all sequences that match the given sequence.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     */
    public abstract void search(String entry, int depth);


    /**
     * Removes a sequence from the tree.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     * @return removed node
     */
    public abstract Baseclass remove(String entry, int depth);


    /**
     * Returns number of nodes visited.
     * 
     * @param entry
     *            (String of DNA sequence)
     * @param depth
     *            (depth/level of node)
     * @return integer
     */
    public abstract int numOfNodeVisited(String entry, int depth);
}
