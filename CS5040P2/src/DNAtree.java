import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// On my honor:
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project
// with anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.

/**
 * @author james Jang (janwool))
 * @author Mouad Ait Taleb (mouad)
 * @version (2022-06-05)
 */
public class DNAtree {
    private Baseclass dnaTree;

    /**
     * Default constructor.
     */
    public DNAtree() {
        dnaTree = new flyWeightNode();
    }


    /**
     * Main method (runs program).
     * 
     * @param args
     *            (name of input file)
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
            }
        }
        scanIn.close();
    }


    /**
     * takes a string
     * 
     * @param line
     *            is a string
     * @param count
     *            in an integer
     */
    public void wordProcessing(String line, int count) {

        String[] word = line.split(" \\s*");

        switch (word[0]) {
            case "insert":
                dnaTree = dnaTree.insert(word[1], 0);
                break;
            case "search":
                System.out.println("# of nodes visited: " + dnaTree
                    .numOfNodeVisited(word[1], 0));
                dnaTree.search(word[1], 0);
                break;
            case "print":
                System.out.println("tree dump:");
                if (word.length == 1) {
                    dnaTree.print(0, "");
                }
                else {
                    dnaTree.print(0, word[1]);
                }
                break;
            case "remove":
                dnaTree.remove(word[1], 0);
                break;
            default:
        }
    }
}
