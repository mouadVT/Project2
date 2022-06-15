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
    
    
    public void setTheLeafNode(String sequence, int depth, char index) {

        switch (index) {
            case 'A':
                this.a = new LeafNode(sequence, depth);
                break;
            case 'C':
                this.c = new LeafNode(sequence, depth);
                break;
            case 'G':
                this.g = new LeafNode(sequence, depth);
                break;
            case 'T':
                this.t = new LeafNode(sequence, depth);
                break;
            default:
                this.$ = new LeafNode(sequence, depth);
                break;
        }

    }


    @Override
    public Baseclass insert(String entry, int depth) {
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a = a.insert(entry, depth++);
            }
            else if (entry.charAt(depth) == 'C') {
                c = c.insert(entry, depth++);
            }
            else if (entry.charAt(depth) == 'G') {
                g = g.insert(entry, depth++);
            }
            else {
                t = t.insert(entry, depth++);
            }
            return this;
        }
        $ = $.insert(entry, depth);
        return this;
    }


    @Override
    public String print(int depth) {
        String st0 = "";
        String st1 = "I";
        for (int i = 0; i < depth; i++) {
            st0 += " ";
        }
        System.out.println(st0 + st1);
        a.print(depth);
        c.print(depth);
        g.print(depth);
        t.print(depth);
        $.print(depth);
        return st0 + st1;
    }


    @Override
    public void search(String entry, int depth) {
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a.search(entry, depth++);
            }
            else if (entry.charAt(depth) == 'C') {
                c.search(entry, depth++);
            }
            else if (entry.charAt(depth) == 'G') {
                g.search(entry, depth++);
            }
            else {
                t.search(entry, depth++);
            }
        }
        $.search(entry, depth);
    }


    @Override
    public Baseclass remove(String entry, int depth) {
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a = a.remove(entry, ++depth);
            }
            else if (entry.charAt(depth) == 'C') {
                c = c.remove(entry, ++depth);
            }
            else if (entry.charAt(depth) == 'G') {
                g = g.remove(entry, ++depth);
            }
            else {
                t = t.remove(entry, ++depth);
            }
            return this;
        }
        $ = $.remove(entry, depth);
        return this;
    }

}
