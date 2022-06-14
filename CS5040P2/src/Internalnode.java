public class Internalnode extends Baseclass {
    
    private Baseclass a, c, g, t, $;
    
    public Internalnode(String entry, char character) {
        this.setTheLeafNode(entry, character);
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
//        if (depth == entry.length() || entry.charAt(depth)=='$') {
//            return $ = $.insert(entry, depth);
//        }
        if (depth <= entry.length()) {
            switch (entry.charAt(depth)) {
                case 'A':
                     a = a.insert(entry, depth + 1);
                case 'C':
                     c = c.insert(entry, depth + 1);
                case 'G':
                     g = g.insert(entry, depth + 1);
                case 'T':
                     t = t.insert(entry, depth + 1);
                default:
                    break;
            }
            return this;
        }
        return $ = $.insert(entry, depth);
        
    }


    @Override
    public String print(int depth) {
        String st0 ="";
        String st1 = "I";
        for (int i = 0; i < depth; i++) {
            st0+=" ";
        }
        System.out.println(st0+st1);
        return st0+st1;
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
    
    public void setTheLeafNode(String sequence, char character) {

        switch (character) {
            case 'A':
                this.a = new LeafNode(sequence);
                this.c = new flyweightnode();
                this.g = new flyweightnode();
                this.t = new flyweightnode();
                this.$ = new flyweightnode();
                break;
            case 'C':
                this.a = new flyweightnode();
                this.c = new LeafNode(sequence);
                this.g = new flyweightnode();
                this.t = new flyweightnode();
                this.$ = new flyweightnode();
                break;
            case 'G':
                this.a = new flyweightnode();
                this.c = new flyweightnode();
                this.g = new LeafNode(sequence);
                this.t = new flyweightnode();
                this.$ = new flyweightnode();
                break;
            case 'T':
                this.a = new flyweightnode();
                this.c = new flyweightnode();
                this.g = new flyweightnode();
                this.t = new LeafNode(sequence);
                this.$ = new flyweightnode();
                break;
            default:
                this.a = new flyweightnode();
                this.c = new flyweightnode();
                this.g = new flyweightnode();
                this.t = new flyweightnode();
                this.$ = new LeafNode(sequence);
                break;
        }

    }

}
