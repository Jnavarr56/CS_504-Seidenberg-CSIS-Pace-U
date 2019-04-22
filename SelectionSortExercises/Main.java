import java.util.*;
public class Main {

    public static void main(String args[]) {

        int[] sortedOutput =  SelectionSort1.selSortAscend(new int[] {910,4, 3, 2, 1,8,2,4});

        System.out.printf(
            "OUTPUT ARRAY: %s\n", 
            Arrays.toString(sortedOutput)
        );

    }

}