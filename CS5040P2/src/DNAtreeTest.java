import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import student.TestCase;

/**
 * Tests DNAtree methods.
 * 
 * @author James Jang (jangwool)
 * @author Mouad Ait Taleb Ali (mouad)
 * @version 06/08/2022
 */
public class DNAtreeTest extends TestCase {

    private DNAtree tree;

    /**
     * Sets up each test method.
     */
    public void setUp() {
        tree = new DNAtree();
    }


    /**
     * Tests main method.
     * 
     * @throws FileNotFoundException
     */
    public void testMain() throws FileNotFoundException {
        String inp = "       insert ACGT     \r\n" + "    \r\n" + "\r\n"
            + "\r\n" + " insert            AAAA   \r\n" + " insert AA\r\n"
            + "insert                 AAACCCCGGTGAAAACGTA\r\n"
            + "insert       ACTGGGAA          \r\n" + "\r\n"
            + "remove       ACGT         \r\n" + "\r\n" + "insert ACCTT\r\n"
            + "insert ACTTA\r\n" + " \r\n" + " print\r\n" + " \r\n"
            + " insert TATA\r\n" + " insert TCG\r\n" + " \r\n"
            + " print lengths\r\n" + " print stats\r\n" + " \r\n"
            + " search         AAAA$\r\n"
            + "                         search     AA\r\n"
            + " search      ACGT$\r\n" + "  \r\n" + "  \r\n" + "           \r\n"
            + "           \r\n" + "              \r\n" + "              ";

        String ans = "sequence ACGT inserted at level 0\r\n"
            + "sequence AAAA inserted at level 2\r\n"
            + "sequence AA inserted at level 3\r\n"
            + "sequence AAACCCCGGTGAAAACGTA inserted at level 4\r\n"
            + "sequence ACTGGGAA inserted at level 3\r\n"
            + "sequence ACGT removed\r\n"
            + "sequence ACCTT inserted at level 3\r\n"
            + "sequence ACTTA inserted at level 4\r\n" + "tree dump:\r\n"
            + "I\r\n" + "  I\r\n" + "    I\r\n" + "      I\r\n"
            + "        AAAA\r\n" + "        AAACCCCGGTGAAAACGTA\r\n"
            + "        E\r\n" + "        E\r\n" + "        E\r\n"
            + "      E\r\n" + "      E\r\n" + "      E\r\n" + "      AA\r\n"
            + "    I\r\n" + "      E\r\n" + "      ACCTT\r\n" + "      E\r\n"
            + "      I\r\n" + "        E\r\n" + "        E\r\n"
            + "        ACTGGGAA\r\n" + "        ACTTA\r\n" + "        E\r\n"
            + "      E\r\n" + "    E\r\n" + "    E\r\n" + "    E\r\n"
            + "  E\r\n" + "  E\r\n" + "  E\r\n" + "  E\r\n"
            + "sequence TATA inserted at level 1\r\n"
            + "sequence TCG inserted at level 2\r\n" + "tree dump:\r\n"
            + "I\r\n" + "  I\r\n" + "    I\r\n" + "      I\r\n"
            + "        AAAA 4\r\n" + "        AAACCCCGGTGAAAACGTA 19\r\n"
            + "        E\r\n" + "        E\r\n" + "        E\r\n"
            + "      E\r\n" + "      E\r\n" + "      E\r\n" + "      AA 2\r\n"
            + "    I\r\n" + "      E\r\n" + "      ACCTT 5\r\n" + "      E\r\n"
            + "      I\r\n" + "        E\r\n" + "        E\r\n"
            + "        ACTGGGAA 8\r\n" + "        ACTTA 5\r\n" + "        E\r\n"
            + "      E\r\n" + "    E\r\n" + "    E\r\n" + "    E\r\n"
            + "  E\r\n" + "  E\r\n" + "  I\r\n" + "    TATA 4\r\n"
            + "    TCG 3\r\n" + "    E\r\n" + "    E\r\n" + "    E\r\n"
            + "  E\r\n" + "tree dump:\r\n" + "I\r\n" + "  I\r\n" + "    I\r\n"
            + "      I\r\n" + "        AAAA A:100.00 C:0.00 G:0.00 T:0.00\r\n"
            + "        AAACCCCGGTGAAAACGTA A:42.11 C:26.32 G:21.05 T:10.53\r\n"
            + "        E\r\n" + "        E\r\n" + "        E\r\n"
            + "      E\r\n" + "      E\r\n" + "      E\r\n"
            + "      AA A:100.00 C:0.00 G:0.00 T:0.00\r\n" + "    I\r\n"
            + "      E\r\n" + "      ACCTT A:20.00 C:40.00 G:0.00 T:40.00\r\n"
            + "      E\r\n" + "      I\r\n" + "        E\r\n" + "        E\r\n"
            + "        ACTGGGAA A:37.50 C:12.50 G:37.50 T:12.50\r\n"
            + "        ACTTA A:40.00 C:20.00 G:0.00 T:40.00\r\n"
            + "        E\r\n" + "      E\r\n" + "    E\r\n" + "    E\r\n"
            + "    E\r\n" + "  E\r\n" + "  E\r\n" + "  I\r\n"
            + "    TATA A:50.00 C:0.00 G:0.00 T:50.00\r\n"
            + "    TCG A:0.00 C:33.33 G:33.33 T:33.33\r\n" + "    E\r\n"
            + "    E\r\n" + "    E\r\n" + "  E\r\n"
            + "# of nodes visited: 5\r\n" + "sequence: AAAA\r\n"
            + "# of nodes visited: 13\r\n" + "sequence: AAAA\r\n"
            + "sequence: AAACCCCGGTGAAAACGTA\r\n" + "sequence: AA\r\n"
            + "# of nodes visited: 4\r\n" + "no sequence found\r\n" + "";

        ByteArrayInputStream inStream = new ByteArrayInputStream(inp
            .getBytes());
        System.setIn(inStream);

        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outStream);
        System.setOut(ps);

        String[] arr = { "SampleInput.txt" };

        DNAtree.main(arr);

        String[] arr2 = outStream.toString().split(System.lineSeparator());
        String out = "";

        for (int i = 0; i < arr2.length; i++) {
            out += arr2[i] + "\r\n";
        }

        assertEquals(ans, out);
    }


    /**
     * Tests fileReader() method.
     * 
     * @throws FileNotFoundException
     */
    public void testFileReader() throws FileNotFoundException {
        Exception exception = null;
        try {
            tree.fileReader("");
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof FileNotFoundException);

        tree.fileReader("SampleInput.txt");
        assertFuzzyEquals("sequence ACGT inserted at level 0\r\n"
            + "sequence AAAA inserted at level 2\r\n"
            + "sequence AA inserted at level 3\r\n"
            + "sequence AAACCCCGGTGAAAACGTA inserted at level 4\r\n"
            + "sequence ACTGGGAA inserted at level 3\r\n"
            + "sequence ACGT removed\r\n"
            + "sequence ACCTT inserted at level 3\r\n"
            + "sequence ACTTA inserted at level 4\r\n" + "tree dump:\r\n"
            + "I\r\n" + "  I\r\n" + "    I\r\n" + "      I\r\n"
            + "        AAAA\r\n" + "        AAACCCCGGTGAAAACGTA\r\n"
            + "        E\r\n" + "        E\r\n" + "        E\r\n"
            + "      E\r\n" + "      E\r\n" + "      E\r\n" + "      AA\r\n"
            + "    I\r\n" + "      E\r\n" + "      ACCTT\r\n" + "      E\r\n"
            + "      I\r\n" + "        E\r\n" + "        E\r\n"
            + "        ACTGGGAA\r\n" + "        ACTTA\r\n" + "        E\r\n"
            + "      E\r\n" + "    E\r\n" + "    E\r\n" + "    E\r\n"
            + "  E\r\n" + "  E\r\n" + "  E\r\n" + "  E\r\n"
            + "sequence TATA inserted at level 1\r\n"
            + "sequence TCG inserted at level 2\r\n" + "tree dump:\r\n"
            + "I\r\n" + "  I\r\n" + "    I\r\n" + "      I\r\n"
            + "        AAAA 4\r\n" + "        AAACCCCGGTGAAAACGTA 19\r\n"
            + "        E\r\n" + "        E\r\n" + "        E\r\n"
            + "      E\r\n" + "      E\r\n" + "      E\r\n" + "      AA 2\r\n"
            + "    I\r\n" + "      E\r\n" + "      ACCTT 5\r\n" + "      E\r\n"
            + "      I\r\n" + "        E\r\n" + "        E\r\n"
            + "        ACTGGGAA 8\r\n" + "        ACTTA 5\r\n" + "        E\r\n"
            + "      E\r\n" + "    E\r\n" + "    E\r\n" + "    E\r\n"
            + "  E\r\n" + "  E\r\n" + "  I\r\n" + "    TATA 4\r\n"
            + "    TCG 3\r\n" + "    E\r\n" + "    E\r\n" + "    E\r\n"
            + "  E\r\n" + "tree dump:\r\n" + "I\r\n" + "  I\r\n" + "    I\r\n"
            + "      I\r\n" + "        AAAA A:100.00 C:0.00 G:0.00 T:0.00\r\n"
            + "        AAACCCCGGTGAAAACGTA A:42.11 C:26.32 G:21.05 T:10.53\r\n"
            + "        E\r\n" + "        E\r\n" + "        E\r\n"
            + "      E\r\n" + "      E\r\n" + "      E\r\n"
            + "      AA A:100.00 C:0.00 G:0.00 T:0.00\r\n" + "    I\r\n"
            + "      E\r\n" + "      ACCTT A:20.00 C:40.00 G:0.00 T:40.00\r\n"
            + "      E\r\n" + "      I\r\n" + "        E\r\n" + "        E\r\n"
            + "        ACTGGGAA A:37.50 C:12.50 G:37.50 T:12.50\r\n"
            + "        ACTTA A:40.00 C:20.00 G:0.00 T:40.00\r\n"
            + "        E\r\n" + "      E\r\n" + "    E\r\n" + "    E\r\n"
            + "    E\r\n" + "  E\r\n" + "  E\r\n" + "  I\r\n"
            + "    TATA A:50.00 C:0.00 G:0.00 T:50.00\r\n"
            + "    TCG A:0.00 C:33.33 G:33.33 T:33.33\r\n" + "    E\r\n"
            + "    E\r\n" + "    E\r\n" + "  E\r\n"
            + "# of nodes visited: 5\r\n" + "sequence: AAAA\r\n"
            + "# of nodes visited: 13\r\n" + "sequence: AAAA\r\n"
            + "sequence: AAACCCCGGTGAAAACGTA\r\n" + "sequence: AA\r\n"
            + "# of nodes visited: 4\r\n" + "no sequence found\r\n" + "",
            systemOut().getHistory());
        systemOut().clearHistory();
    }

    /**
     * Tests wordProcessing() method.
     * 
     * @throws FileNotFoundException
     */
    public void testWordProcessing() {
        systemOut().clearHistory();
        tree.wordProcessing("insert ACGT", 0);
        assertFuzzyEquals("sequence ACGT inserted at level 0", systemOut()
            .getHistory());
        
        systemOut().clearHistory();
        tree.wordProcessing("search ACGT$", 0);
        assertFuzzyEquals("# of nodes visited: 1\r\n"
            + "sequence: ACGT", systemOut()
            .getHistory());
        
        systemOut().clearHistory();
        tree.wordProcessing("search AC", 0);
        assertFuzzyEquals("# of nodes visited: 1\r\n"
            + "sequence: ACGT", systemOut()
            .getHistory());
        
        systemOut().clearHistory();
        tree.wordProcessing("print", 0);
        assertFuzzyEquals("tree dump:\r\n"
            + "ACGT", systemOut()
            .getHistory());
        
        systemOut().clearHistory();
        tree.wordProcessing("remove ACGT", 0);
        assertFuzzyEquals("sequence ACGT removed", systemOut()
            .getHistory());
        
        systemOut().clearHistory();
        tree.wordProcessing("", 0);
        assertFuzzyEquals("", systemOut()
            .getHistory());
    }
}
