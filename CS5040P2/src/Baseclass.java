/**
 * DNA tree node interface that defines operations for nodes.
 */
public interface Baseclass<T> {
    /**
     * Inserts sequence into tree node.
     */
    public void insert(String entry, int depth);


    /**
     * Prints out DNA tree.
     */
    public String print();


    /**
     * Finds all sequences that match the parameter.
     */
    public void search(String entry);


    /**
     * Removes a sequence from the tree.
     */
    public String remove();
}
