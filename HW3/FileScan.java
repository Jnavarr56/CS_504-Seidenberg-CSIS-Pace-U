import java.util.*;
import java.io.*;


public class FileScan {

    public static void main(String args[]) throws Exception {
        
        Scanner scan = new Scanner(new File(args[0].trim()));

        int numLines = 0, numWords = 0;

        String line;

        while (scan.hasNextLine()) {

            line = scan.nextLine().trim();

            // Break each line we read into an array of words, then increase the number of words by the size of the array.
            numWords += line.matches(".*[a-zA-Z0-9]+.*") ? line.split(" ").length : 0; 

            // Every time we advance to a new line (scan.nextLine()) increase the number of lines by 1.
            numLines++;

        }

        System.out.printf("Number of Words: %d Number of Lines: %d", numWords, numLines);

    }

}