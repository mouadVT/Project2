import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * 
 */

/**
 * @author 1alim
 *
 */
public class DNAtree {

    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

    }


    public void fileReader(String fileName) throws FileNotFoundException {
        Scanner scanIn = new Scanner(new File(fileName));
        while (scanIn.hasNextLine()) {
            String line = scanIn.nextLine().trim();
            if (!line.isEmpty()) {
                this.wordProcessing(line);
            }
        }
        scanIn.close();
    }
    
    public void wordProcessing(String line) {
        
        String[] word = line.split(" \\s*"); // there are only two possible words 
        switch (word[0]) {
            case "insert":
                /// we insert word[1] to DNA tree
                break;
            case "search":
              /// we search for word[1] in DNA tree
                break;
            case "print":
              /// we print word[1]from DNA tree
                break;
            case "remove":
              /// we remove word[1] from DNA tree
                break;
            default:
        }
    }
}
