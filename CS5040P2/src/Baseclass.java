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
    public abstract String print(int depth);


    /**
     * Finds all sequences that match the given sequence.
     */
    public abstract void search(String entry);


    /**
     * Removes a sequence from the tree.
     */
    public abstract String remove(String entry);
}
