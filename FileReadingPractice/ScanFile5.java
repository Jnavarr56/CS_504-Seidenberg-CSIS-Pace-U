import java.util.*;
import java.io.*;

public class ScanFile5 {

    public static void main(String args[]) throws Exception {

        Scanner scan = new Scanner(new File("textfile.txt"));

        int numWords = 0, numLines = 0;

        String line;

        while (scan.hasNextLine()) {

            line = scan.nextLine();

            numWords += line.matches(".*[a-zA-Z_0-9].*") ? line.split(" ").length : 0;

            numLines++;

        }

        System.out.printf("Num Words: %d Num Lines: %d\n", numWords, numLines);

    }
}