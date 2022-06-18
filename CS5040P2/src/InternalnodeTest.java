import student.TestCase;

/**
 * Tests Internalnode methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class InternalnodeTest extends TestCase {
    private Baseclass interNode;

    /**
     * Sets up each test method.
     */
    public void setUp() {
        interNode = new Internalnode();
    }


    /**
     * Test the insert() method.
     */
    public void testInsert() {
        systemOut().clearHistory();
        interNode.insert("A", 0);
        interNode.insert("A", 0);
        interNode.insert("C", 0);
        interNode.insert("AA", 0);
        interNode.insert("AAA", 0);
        interNode.insert("G", 0);
        interNode.insert("GG", 0);
        interNode.insert("CC", 0);
        interNode.insert("T", 0);
        interNode.insert("TATATA", 0);
        systemOut().clearHistory();
        interNode.print(0, "");
        String output = "I\r\n" + "  I\r\n" + "    I\r\n" + "      AAA\r\n"
            + "      E\r\n" + "      E\r\n" + "      E\r\n" + "      AA\r\n"
            + "    E\r\n" + "    E\r\n" + "    E\r\n" + "    A\r\n" + "  I\r\n"
            + "    E\r\n" + "    CC\r\n" + "    E\r\n" + "    E\r\n"
            + "    C\r\n" + "  I\r\n" + "    E\r\n" + "    E\r\n" + "    GG\r\n"
            + "    E\r\n" + "    G\r\n" + "  I\r\n" + "    TATATA\r\n"
            + "    E\r\n" + "    E\r\n" + "    E\r\n" + "    T\r\n" + "  E";
        String console = systemOut().getHistory();
        assertFuzzyEquals(console, output);
    }


    /**
     * Test the print method.
     */
    public void testPrint() {

        interNode.print(0, "");
        String output = "I\r\n" + "  E\r\n" + "  E\r\n" + "  E\r\n" + "   E\r\n"
            + "  E";
        String console = systemOut().getHistory();
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();

        interNode.insert("A", 0);
        interNode.insert("G", 0);
        interNode.insert("AA", 0);
        systemOut().clearHistory();
        interNode.print(0, "");
        console = systemOut().getHistory();
        output = "I\r\n" + " I\r\n" + "  AA\r\n" + "  E\r\n" + "  E\r\n"
            + "  E\r\n" + "  A\r\n" + " E\r\n" + " G\r\n" + " E\r\n" + " E";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();

        interNode.insert("A", 0);
        interNode.insert("G", 0);
        interNode.insert("AA", 0);
        systemOut().clearHistory();
        interNode.print(0, "lengths");
        console = systemOut().getHistory();
        output = "I\r\n" + " I\r\n" + "  AA 2\r\n" + "  E\r\n" + "  E\r\n"
            + "  E\r\n" + "  A 1\r\n" + " E\r\n" + " G 1\r\n" + " E\r\n" + " E";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();

        interNode.insert("A", 0);
        interNode.insert("G", 0);
        interNode.insert("AA", 0);
        systemOut().clearHistory();
        interNode.print(0, "stats");
        console = systemOut().getHistory();
        output = "I\r\n" + " I\r\n" + "  AA A:100.00 C:0.00 G:0.00 T:0.00\r\n"
            + "  E\r\n" + "  E\r\n" + "  E\r\n"
            + "  A A:100.00 C:0.00 G:0.00 T:0.00\r\n" + " E\r\n"
            + " G A:0.00 C:0.00 G:100.00 T:0.00\r\n" + " E\r\n" + " E";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
    }


    /**
     * Test the search method.
     */
    public void testSerch() {
        systemOut().clearHistory();
        interNode.search("A", 0);
        interNode.search("C", 0);
        interNode.search("G", 0);
        interNode.search("T", 0);
        interNode.search("E", 0);

        interNode.insert("A", 0);
        interNode.insert("A", 0);
        interNode.insert("C", 0);
        interNode.insert("AA", 0);
        interNode.insert("T", 0);
        interNode.insert("AAA", 0);
        interNode.insert("G", 0);
        interNode.insert("GG", 0);
        interNode.insert("CC", 0);
        interNode.insert("TT", 0);
        interNode.insert("TTTA", 0);

        interNode.search("A", 0);
        interNode.search("A", 0);
        interNode.search("C", 0);
        interNode.search("AA", 0);
        interNode.search("AAA", 0);
        interNode.search("G", 0);
        interNode.insert("GG", 0);
        interNode.search("CC", 0);
        interNode.search("T", 0);
        interNode.search("TATATA", 0);
        interNode.search("G", 0);
        interNode.search("GG", 0);
        interNode.search("CC", 0);
        interNode.search("TTTA ", 0);
        interNode.search("TATATA", 0);
        interNode.search("TT", 0);
        String console = systemOut().getHistory();
        String output = "no sequence found\r\n" + "no sequence found\r\n"
            + "no sequence found\r\n" + "no sequence found\r\n"
            + "no sequence found\r\n" + "sequence A inserted at level 1\r\n"
            + "sequence A already exists\r\n"
            + "sequence C inserted at level 1\r\n"
            + "sequence AA inserted at level 2\r\n"
            + "sequence T inserted at level 1\r\n"
            + "sequence AAA inserted at level 3\r\n"
            + "sequence G inserted at level 1\r\n"
            + "sequence GG inserted at level 2\r\n"
            + "sequence CC inserted at level 2\r\n"
            + "sequence TT inserted at level 2\r\n"
            + "sequence TTTA inserted at level 3\r\n" + "sequence: AAA\r\n"
            + "sequence: AA\r\n" + "sequence: A\r\n" + "sequence: AAA\r\n"
            + "sequence: AA\r\n" + "sequence: A\r\n" + "sequence: CC\r\n"
            + "sequence: C\r\n" + "sequence: AAA\r\n" + "sequence: AA\r\n"
            + "sequence: AAA\r\n" + "sequence: GG\r\n" + "sequence: G\r\n"
            + "sequence GG already exists\r\n" + "sequence: CC\r\n"
            + "sequence: TTTA\r\n" + "sequence: TT\r\n" + "sequence: T\r\n"
            + "no sequence found\r\n" + "sequence: GG\r\n" + "sequence: G\r\n"
            + "sequence: GG\r\n" + "sequence: CC\r\n" + "no sequence found\r\n"
            + "no sequence found\r\n" + "sequence: TTTA\r\n" + "sequence: TT";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();

    }


    /**
     * test the remove method
     */
    public void testRemove() {
        systemOut().clearHistory();
        interNode.insert("A", 0);
        interNode.insert("G", 0);
        interNode.insert("C", 0);
        interNode.insert("T", 0);
        interNode.insert("AC", 0);
        systemOut().clearHistory();
        interNode.remove("A", 0);
        String console = systemOut().getHistory();
        String output = "sequence A removed";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        interNode.remove("A", 0);
        console = systemOut().getHistory();
        output = "sequence A does not exist";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        interNode.remove("G", 0);
        console = systemOut().getHistory();
        output = "sequence G removed";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        interNode.remove("C", 0);
        console = systemOut().getHistory();
        output = "sequence C removed";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        interNode.remove("T", 0);
        console = systemOut().getHistory();
        output = "sequence T removed";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        interNode.remove("AC", 0);
        console = systemOut().getHistory();
        output = "sequence AC removed";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
    }


    /**
     * Test the Number Of Node Visited
     */
    public void testNumOfNodeVisited() {
        Baseclass interNode1 = new Internalnode();
        systemOut().clearHistory();
        interNode.insert("T", 0);
        interNode.insert("A", 0);
        interNode.insert("G", 0);
        interNode.insert("C", 0);
        systemOut().clearHistory();
        assertEquals(2, interNode.numOfNodeVisited("T", 0));
        assertEquals(2, interNode.numOfNodeVisited("A", 0));
        assertEquals(2, interNode.numOfNodeVisited("G", 0));
        assertEquals(2, interNode.numOfNodeVisited("C", 0));
        assertEquals(2, interNode.numOfNodeVisited("E", 0));
        interNode1.insert("A", 0);
        interNode1.insert("AAAA", 0);
        assertEquals(7, interNode1.numOfNodeVisited("A", 0));
        assertEquals(3, interNode1.numOfNodeVisited("AAAA", 0));
        interNode1.print(0, "");
    }


    /**
     * Test set the leaf Node.
     */
    public void testSetTheLeafNode() {
        systemOut().clearHistory();
        interNode.insert("A", 0);
        systemOut().clearHistory();
        ((Internalnode)interNode).setTheLeafNode("G", 0, 'A');
        interNode.print(0, "");
        String console = systemOut().getHistory();
        String output = "I\r\n" + "  G\r\n" + "  E\r\n" + "  E\r\n" + "  E\r\n"
            + "  E";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        ((Internalnode)interNode).setTheLeafNode("G", 0, 'C');
        interNode.print(0, "");
        console = systemOut().getHistory();
        output = "I\r\n" + "  G\r\n" + "  G\r\n" + "  E\r\n" + "  E\r\n"
            + "  E";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        ((Internalnode)interNode).setTheLeafNode("G", 0, 'G');
        interNode.print(0, "");
        console = systemOut().getHistory();
        output = "I\r\n" + "  G\r\n" + "  G\r\n" + "  G\r\n" + "  E\r\n"
            + "  E";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        ((Internalnode)interNode).setTheLeafNode("G", 0, 'T');
        interNode.print(0, "");
        console = systemOut().getHistory();
        output = "I\r\n" + "  G\r\n" + "  G\r\n" + "  G\r\n" + "  G\r\n"
            + "  E";
        assertFuzzyEquals(console, output);
        systemOut().clearHistory();
        ((Internalnode)interNode).setTheLeafNode("G", 0, 'E');
        interNode.print(0, "");
        console = systemOut().getHistory();
        output = "I\r\n" + "  G\r\n" + "  G\r\n" + "  G\r\n" + "  G\r\n"
            + "  G";
        assertFuzzyEquals(console, output);
    }


    /**
     * Tests returnLeafNode() method.
     */
    public void testReturnLeafNode() {
        Internalnode interNode2 = new Internalnode();
        Internalnode interNode3 = new Internalnode();
        Internalnode interNode4 = new Internalnode();
        Internalnode interNode5 = new Internalnode();

        systemOut().clearHistory();

        interNode.insert("A", 0);

        ((Internalnode)interNode).numOfLeafNodes();
        ((Internalnode)interNode).numOfFlyNodes();

        ((Internalnode)interNode).returnLeafNode();
        assertFuzzyEquals("sequence A inserted at level 1", systemOut()
            .getHistory());

        systemOut().clearHistory();

        interNode2.insert("C", 0);

        ((Internalnode)interNode2).numOfLeafNodes();
        ((Internalnode)interNode2).numOfFlyNodes();

        ((Internalnode)interNode2).returnLeafNode();
        assertFuzzyEquals("sequence C inserted at level 1", systemOut()
            .getHistory());

        systemOut().clearHistory();

        interNode3.insert("G", 0);

        ((Internalnode)interNode3).numOfLeafNodes();
        ((Internalnode)interNode3).numOfFlyNodes();

        ((Internalnode)interNode3).returnLeafNode();
        assertFuzzyEquals("sequence G inserted at level 1", systemOut()
            .getHistory());

        systemOut().clearHistory();

        interNode4.insert("T", 0);

        ((Internalnode)interNode4).numOfLeafNodes();
        ((Internalnode)interNode4).numOfFlyNodes();

        ((Internalnode)interNode4).returnLeafNode();
        assertFuzzyEquals("sequence T inserted at level 1", systemOut()
            .getHistory());

        systemOut().clearHistory();

        interNode5.insert("A", 0);
        interNode5.insert("AA", 0);

        // interNode5.print(0, "");

        ((Internalnode)interNode5).numOfLeafNodes();
        ((Internalnode)interNode5).numOfFlyNodes();

        ((Internalnode)interNode5).returnLeafNode();
        assertFuzzyEquals("sequence A inserted at level 1\r\n"
            + "sequence AA inserted at level 2", systemOut().getHistory());
    }


    /**
     * Tests numOfLeafNodes() method.
     */
    public void testNumOfLeafNodes() {
        interNode.insert("A", 0);
        interNode.insert("C", 0);

        assertEquals(2, ((Internalnode)interNode).numOfLeafNodes());
    }


    /**
     * Tests numOfFlyNodes() method.
     */
    public void testNumOfFlyNodes() {
        interNode.insert("A", 0);
        interNode.insert("C", 0);

        assertEquals(3, ((Internalnode)interNode).numOfFlyNodes());
    }
}
