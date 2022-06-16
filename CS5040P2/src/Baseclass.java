/**
 * DNA tree node abstract class that defines operations for nodes.
 */
 public abstract class Baseclass {
    /**
     * Inserts sequence into tree node.
     */
    public abstract Baseclass insert(String entry, int depth);


    /**
     * Prints out DNA tree.
     */
    public abstract void print(int depth, String entry);


    /**
     * Finds all sequences that match the given sequence.
     */
    public abstract void search(String entry, int depth);


    /**
     * Removes a sequence from the tree.
     */
    public abstract Baseclass remove(String entry, int depth);
    
    /**
     * returns number of nodes visited 
     * @param entry
     * @param depth
     * @return integer
     */
    public abstract int numOfNodeVisited(String entry, int depth);
}
