// James

/**
 * flyweightnode class.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class flyweightnode implements Baseclass {
    
    private static flyweightnode fw;
    
    /**
     * Default constructor.
     */
    public flyweightnode() {
        fw = new flyweightnode();
    }

    
    /**
     * Inserts sequence into empty leaf node
     * and converts flyweight into leaf node.
     * 
     * @param seq (Linked list of DNA sequence)
     */
    @Override
    public void insert(Linkedlist<String> seq) {
        
    }


    /**
     * Prints out "E" for empty leaf node.
     */
    @Override
    public void print() {
        System.out.println("E");
    }


    @Override
    public void search() {
        // TODO Auto-generated method stub

    }


    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

}
