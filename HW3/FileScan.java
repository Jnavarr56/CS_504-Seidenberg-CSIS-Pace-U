import java.util.*;
import java.io.*;


public class FileScan {

    public static void main(String args[]) throws Exception {

        Scanner scan = new Scanner(new File(args[0].trim()));

        int numLines = 0, numWords = 0;

        while (scan.hasNextLine()) {

            // Break each line we read into an array of words, then increase the number of words by the size of the array.
            numWords += scan.nextLine().split(" ").length; 

            // We go to the next line (scan.nextLine()) increase the number of lines by 1.
            numLines++;

        }

        System.out.println(

            String.format(
                "Number of Words: %s\n" +
                "Number of Lines: %s",
                numWords,
                numLines

            )

        );

    }

}