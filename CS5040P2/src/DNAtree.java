import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * All DNA tree operations must be implemented recursively
 */
public class DNAtree {
   private int depth; // where an how the depth should be updated
    
//    private Internalnode internalNode;
//    private LeafNode leafNode;
    private Baseclass dnaTree;
    
    /**
     * All DNA tree operations must be implemented recursively
     */
    public DNAtree() {
        dnaTree = new flyweightnode();
        this.depth = 0;
    }
    
    /**
     * Main method (runs program).
     * 
     * @param args (name of input file)
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                "Exactly one argument needed: file-input");
        }
        String inputFilePath = args[0];
        
        DNAtree tree = new DNAtree();
        
        tree.fileReader(inputFilePath);
    }

    
    /**
     * Reads input file.
     * 
     * @param fileName
     *            (name of input file)
     */
    public void fileReader(String fileName) throws FileNotFoundException {
        Scanner scanIn = new Scanner(new File(fileName));
        while (scanIn.hasNextLine()) {
            String line = scanIn.nextLine().trim();
            if (!line.isEmpty()) {
                line = line.replaceAll("\\s+", " ");
                this.wordProcessing(line);
            }
        }
        scanIn.close();
    }
    
    public void wordProcessing(String line) {
        
        String[] word = line.split(" \\s*"); //there are only two possible words
        switch (word[0]) {
            case "insert":
                dnaTree.insert(word[1], 0);
                //depth++;
                /// we insert word[1] to DNA tree
                break;
            case "search":
              /// we search for word[1] in DNA tree
                break;
            case "print":
              /// we print word[1]from DNA tree
                break;
            case "remove":
                dnaTree.remove(word[1], 0);
              /// we remove word[1] from DNA tree
                break;
            default:
        }
    }
    
    
    public void insert(DNAtree entry, int depth) {
        // if internal -> set to internal node
        
       
    }
}
