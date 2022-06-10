/**
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class Linkedlist<T> {
    private Node<T> front;
    private Node<T> current;
    private Node<T> tail;
    private int size;

    /**
     * list Constructor
     * 
     * 
     */
    public Linkedlist() {
        front = new Node<T>(null);
        current = front;
        tail = front;
        this.size = 0;
    }


    /**
     * insert data to back of the list
     * 
     * @param entry
     *            data that would passed to the list
     * @return boolean if the data was added to the list
     */
    public boolean insert(T entry) {
        Node<T> temp = front;
        if (isEmpty()) {
            front.setData(entry);
        }
        else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<T>(entry));
            current = temp.getNext();
            tail = temp.getNext();
        }
        size++;
        return true;
    }


    /**
     * moves the current pointer to the end of the list
     */
    public void moveToEnd() {
        current = tail;
    }


    /**
     * Return list length
     * 
     * @return size of the stack
     */
    public int length() {
        return size;
    }


    /**
     * return data from the back of the list
     * 
     * @return data out the stack
     */
    public T getValueAtCurrPos() {
        Node<T> temp = front;
        T data = current.getData();
        while (temp.getNext() != current && temp != current) {
            temp = temp.getNext();
        }
        current = temp;
        return data;
    }


    /**
     * Check if the list is empty
     * 
     * @return boolean if the list is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * clears the list
     */
    public void clear() {
        front = new Node<T>(null);
        current = new Node<T>(null);
        tail = new Node<T>(null);
        this.size = 0;
    }


    /**
     * @return string of data to the user
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (!isEmpty()) {
            Node<T> temp = front;
            while (temp != null) {
                T data = temp.getData();
                builder.append(data.toString());
                temp = temp.getNext();
            }
        }
        return builder.toString();
    }
}
