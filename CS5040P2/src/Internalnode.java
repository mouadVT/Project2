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
    
    
    public Baseclass getLeaf() {
        if (a instanceof LeafNode) {
            return a;
        }
        else if (c instanceof LeafNode) {
            return c;
        }
        else if (g instanceof LeafNode) {
            return g;
        }
        else if (t instanceof LeafNode) {
            return t;
        }
        return t;
    }


    @Override
    public Baseclass insert(String entry, int depth) {
        /*
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a = a.insert(entry, depth+1);
            }
            else if (entry.charAt(depth) == 'C') {
                c = c.insert(entry, depth+1);
            }
            else if (entry.charAt(depth) == 'G') {
                g = g.insert(entry, depth+1);
            }
            else if (entry.charAt(depth) == 'T') {
                t = t.insert(entry, depth+1);
            }
            else if (entry.charAt(depth) == '$') {
                $ = $.insert(entry, depth+1);
            }
            return this;
        }
        return this;
        */
        
        
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a = a.insert(entry, depth+1);
            }
            else if (entry.charAt(depth) == 'C') {
                c = c.insert(entry, depth+1);
            }
            else if (entry.charAt(depth) == 'G') {
                g = g.insert(entry, depth+1);
            }
            else {
                t = t.insert(entry, depth+1);
            }
            return this;
        }
        $ = $.insert(entry, depth+1);
        return this;
    }


    @Override
    public void print(int depth, String entry) {
        String st0 = "";
        String st1 = "I";
        for (int i = 0; i < depth; i++) {
            st0 += " ";
        }
        System.out.println(st0 + st1);
        a.print(depth+1, entry);
        c.print(depth+1, entry);
        g.print(depth+1, entry);
        t.print(depth+1, entry);
        $.print(depth+1, entry);
    }


    @Override
    public void search(String entry, int depth) {
        if (depth < entry.length()) {
            if (entry.charAt(depth) == 'A') {
                a.search(entry, depth+1);
            }
            else if (entry.charAt(depth) == 'C') {
                c.search(entry, depth+1);
            }
            else if (entry.charAt(depth) == 'G') {
                g.search(entry, depth+1);
            }
            else {
                t.search(entry, depth+1);
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
    public int numOfNodeVisited(String entry, int depth) {
        return depth;
        }
    // do we have to implement equals or comparison method at all?
    
    // 
}
