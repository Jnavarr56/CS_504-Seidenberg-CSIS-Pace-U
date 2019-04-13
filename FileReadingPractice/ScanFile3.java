import java.util.*;
import java.io.*;

public class ScanFile3 {

    public static void main(String args[]) throws Exception {

        Scanner scan = new Scanner(new File("textfile.txt"));

        int numLines = 0, numWords = 0;

        while(scan.hasNextLine()) {

            numWords += scan.nextLine().split(" ").length;

            numLines++;

        }

        System.out.println("Number of Words: " + numWords);
        System.out.println("Number of Line: " + numLines);
    }


}