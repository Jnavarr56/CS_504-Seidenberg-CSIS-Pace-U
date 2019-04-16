import java.util.*;
import java.io.*;


public class FileScan {

    public static void main(String args[]) throws Exception {
        
        // Parameters will be an array of strings with file name at index 0.
        Scanner scan = new Scanner(new File(args[0].trim()));

        int numLines = 0, numWords = 0;

        String line;

        while (scan.hasNextLine()) {

            // Assign string value of the next line to string variable.
            line = scan.nextLine().trim();

            // Break each line we read into an array of words, then increase the number of words by the size of the array.
            // However, before splitting, make sure to check that the line isn't just made up of white space. 
            // If it is whitespace increase word count by 0, otherwise the size of the line's words array.
            numWords += line.matches(".*[a-zA-Z0-9]+.*") ? line.split(" ").length : 0; 

            // Every time we advance to a new line (scan.nextLine()) increase the number of lines by 1.
            numLines++;

        }

        System.out.printf("Number of Words: %d Number of Lines: %d\n", numWords, numLines);

    }

}