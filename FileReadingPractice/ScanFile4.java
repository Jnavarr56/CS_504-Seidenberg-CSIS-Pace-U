import java.util.*;
import java.io.*;

public class ScanFile4 {

    public static void main(String args[]) throws Exception {

        Scanner scan = new Scanner(new File("textfile.txt"));

        int numWords = 0, numLines = 0;

        String line;

        while (scan.hasNextLine()) {

            line = scan.nextLine().trim();

            // Contains at least 1 alphanumeric character, else make it 0.
            numWords += line.matches(".*[a-zA-Z_0-9]+.*") ? line.split(" ").length : 0;

            numLines++;
 
        }

        System.out.printf("Number of Words: %d Number of Lines: %d\n",  numWords, numLines);

    }

}

