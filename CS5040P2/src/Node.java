/**
 * 
 */

/**
 * @author 1alim
 *@param <T>
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * constructor with one parameter
     * 
     * @param dataPortion
     *            the node would take
     */
    public Node(T dataPortion) {
        this.data = dataPortion;
        this.next = null;
    }


    /**
     * Creates a new node with the given data
     * 
     * @param nextNode
     *            the next node to be in the list
     * @param dataPortion
     *            the data to put inside the node
     */
    public Node(T dataPortion, Node<T> nextNode) {
        this(dataPortion);
        next = nextNode;
    }


    /**
     * Gets the data in the node
     *
     * @return the data in the node
     */
    public T getData() {
        return data;
    }


    /**
     * @param data
     *            the data to set
     */
    public void setData(T data) {
        this.data = data;
    }


    /**
     * Gets the next node
     *
     * @return the next node
     */
    public Node<T> getNext() {
        return next;
    }


    /**
     * Sets the node after this node
     *
     * @param nextNode
     *            to place as next node
     */
    public void setNext(Node<T> nextNode) {
        next = nextNode;
    }
}
