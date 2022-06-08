// On my honor:
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project
// with anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.

/**
 * @author mouad and james
 * @version (2022-06-10)
 * @param <T>
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
