
public class EmptyLeafNode implements Node {

    private static EmptyLeafNode flyweight = null; // Single flyweight for all
                                                    // empty leaf nodes

    /**
     * Factory method to access flyweight
     * 
     * @return
     */
    public static EmptyLeafNode getInstance() {
        if (flyweight == null) {
            flyweight = new EmptyLeafNode();
        }
        return flyweight;
    }

    /**
     * Constructs a Flyweight Private constructor for Singleton pattern. Can
     * 
     * only be instantiated internally
     * 
     * @see EmptyLeafNode#getInstance()
     */
    private EmptyLeafNode() {
        // empty constructor
    }

    /**
     * Print representation of empty leaf node
     */
    @Override
    public void print() {   }

    /**
     * Only called when an empty leaf-node. Replace self with new non-empty leaf
     * node (SequenceNode)
     * 
     * @return the new SequenceNode that will replace this Node in the tree
     */
    @Override
    public Node insert(SavedSequence sequence) {
        return new LeafNode(sequence);
    }

    /*** Attempting to remove an empty leaf node means that we did not find

