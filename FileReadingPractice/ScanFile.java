import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;


public class ScanFile  {
    public static void main(String args[]) throws Exception {

        File f = new File​("textfile.txt");
        Scanner scan = new Scanner(f);

        //ArrayList<String> lines = new ArrayList<String>();

        String[] lineWords;

        int counter = 0;

        while (scan.hasNextLine()) {

            lineWords = scan.nextLine().split(" ");

            for (int l = 0; l < lineWords.length; l++) {
            
                if (lineWords[l].toLowerCase().contains("pellentesque")) { 

                    counter ++;

                }

            }

        }

        System.out.println(counter);

    }

}