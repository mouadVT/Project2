public class Internalnode extends Baseclass {
    
    private Baseclass a, c, g, t, $;
    
    public Internalnode() {
        this.a = new flyweightnode();
        this.c = new flyweightnode();
        this.g = new flyweightnode();
        this.t = new flyweightnode();
        this.$ = new flyweightnode();
    }
    
    // used for testing purposes
    public Baseclass getChild(char dna) {
        if (dna == 'A') {
            return a;
        }
        else if (dna == 'C') {
            return c;
        }
        else if (dna == 'G') {
            return g;
        }
        else if (dna == 'T') {
            return t;
        }
        else if (dna == '$') {
            return $;
        }
        return $;
    }


    @Override
    public Baseclass insert(String entry, int depth) {
        if (depth <= entry.length()) {
            if (entry.charAt(depth) == ('A')) {
                return a = a.insert(entry, depth + 1);
            }
            else if (entry.charAt(depth) == ('T')) {
                return t = t.insert(entry, depth + 1);
            }
            else if (entry.charAt(depth) == ('G')) {
                return g = g.insert(entry, depth + 1);
            }
            else if (entry.charAt(depth) == ('C')) {
                return c = c.insert(entry, depth + 1);
            }
        }
        return $ = $.insert(entry, depth);
    }


    @Override
    public String print() {
        System.out.println("I");
        return "I";
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
