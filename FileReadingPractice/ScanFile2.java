import java.util.*;
import java.io.*;

public class ScanFile2 {

    public static void main(String args[]) throws Exception {

        Scanner scan = new Scanner(new File("textfile.txt"));

        while(scan.hasNextLine()) {

            System.out.println(scan.nextLine());

        }

    }


}