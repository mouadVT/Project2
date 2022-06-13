// Mouad
public class Internalnode extends Baseclass {

    //Baseclass a;
    private Baseclass a,c, g, t, $;
    //private Internalnode a, c, g, t, $;;

    /**
     * @param a
     * @param c
     * @param g
     * @param t
     * @param $
     */
    public Internalnode() {
        this.a = new flyweightnode();
        this.c = new flyweightnode();
        this.g = new flyweightnode();
        this.t = new flyweightnode();
        this.$ = new flyweightnode();
    }


    @Override
    public Baseclass insert(String entry, int depth) {
        if (entry.charAt(depth)==('A')) {
            return a = insert(entry, depth+1);
        }
        else if (entry.equals("T")) {
            return t = insert(entry, depth+1);
        }
        else if (entry.equals("G")) {
            new Internalnode();
        }
        else if (entry.equals("C")) {
            new Internalnode();
        }
            return $ = insert(entry, depth+1);
    }


    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void search(String entry) {
        // TODO Auto-generated method stub

    }


    @Override
    public String remove(String entry) {
        // TODO Auto-generated method stub
        return null;
    }

}
