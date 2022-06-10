//Mouad
public class Internalnode<T> implements Baseclass<T> {

    private flyweightnode<T> a;
    private flyweightnode<T> c;
    private flyweightnode<T> g;
    private flyweightnode<T> t;
    private flyweightnode<T> $;
    
    /**
     * @param a
     * @param c
     * @param g
     * @param t
     * @param $
     */
    public Internalnode() {
        this.a = new flyweightnode<T>() ;
        this.c = new flyweightnode<T>();
        this.g = new flyweightnode<T>();
        this.t = new flyweightnode<T>();
        this.$ = new flyweightnode<T>();
    }

    @Override
    public void insert(T entry, T depth) {
        
    }

    @Override
    public T print() {
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
