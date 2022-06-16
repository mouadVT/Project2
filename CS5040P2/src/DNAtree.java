import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * All DNA tree operations must be implemented recursively
 */
public class DNAtree {
    private int depth; // where an how the depth should be updated
    
    //private Internalnode internalNode;
//    private LeafNode leafNode;
    private Baseclass dnaTree;
    
    /**
     * All DNA tree operations must be implemented recursively
     */
    public DNAtree() {
        dnaTree = new flyweightnode();
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
        int count = 0;
        
        while (scanIn.hasNextLine()) {
            String line = scanIn.nextLine().trim();
            
            if (!line.isEmpty()) {
                line = line.replaceAll("\\s+", " ");
                this.wordProcessing(line, count);
                count++;
                //System.out.println(count);
            }
        }
        scanIn.close();
        //dnaTree.print(0);
    }
    
    public void wordProcessing(String line, int count) {
        
        String[] word = line.split(" \\s*"); //there are only two possible words
        
        //if (count == 0) {
        //    dnaTree = new flyweightnode();
        //}
        
        switch (word[0]) {
            case "insert":
                dnaTree = dnaTree.insert(word[1], 0);
                break;
            case "search":
                // we search for word[1] in DNA tree
                break;
            case "print":
                dnaTree.print(0, word[1]);
                break;
            case "remove":
                //dnaTree.remove(word[1], 0);
                // we remove word[1] from DNA tree
                break;
            default:
        }
        //dnaTree = new Internalnode();
    }
}
