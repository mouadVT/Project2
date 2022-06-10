//Mouad
public class Internalnode extends Baseclass {

    private flyweightnode a;
    private flyweightnode c;
    private flyweightnode g;
    private flyweightnode t;
    private flyweightnode $;
    
    /**
     * @param a
     * @param c
     * @param g
     * @param t
     * @param $
     */
    public Internalnode() {
        this.a = new flyweightnode() ;
        this.c = new flyweightnode();
        this.g = new flyweightnode();
        this.t = new flyweightnode();
        this.$ = new flyweightnode();
    }

    @Override
    public void insert(String entry, int depth) {
        
    }

    /**
     * it should  perform a preorder traversal of the tree
     */
    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void search(T entry) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T remove() {
        // TODO Auto-generated method stub
        return null;
    }
    
 

}
