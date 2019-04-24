import java.util.*;

public class Main {

    private static int getMinIndex(int startSearchIdx, int[] arr) {

        /*your code here*/

        return -1; //Return the index of the minimum item in array, starting the search from the startSearchIdx
        
    }

    private static int[] selectionSort(int[] arr) {

        /*your code here*/

        return new int[]{-1, -1}; //Return sorted array

    }

    public static int[] insertionSort(int arr[]) {  

        /*your code here*/
        
        return new int[]{-1, -1}; //Return sorted array
    }  

    public static int[] bubbleSort(int arr[]) {  

        /*your code here*/

        return new int[]{-1, -1}; //Return sorted array

    }  

    public static int binarySearch(int arr[], int targetValue) {  

        /*your code here*/

        return -1; //Return index of targetValue if in array, otherwise return -1
        
    }  

    public static void main(String[] args) {

        int[] sortTestData = {55, 23, 62, 3, 1, 79, 100, 5000, 5, 1, 12, 67, 4000, 231};
        int[] searchTestData = {1, 2, 3, 4, 5, 78, 200, 335, 1002, 40038, 6666, 8698, 11432, 50000};

        // Uncomment each section to test it. Will print results to terminal

        /*
        // Selection Sort:
        System.out.println(
            Arrays.toString(
                selectionSort(
                    Arrays.copyOf(sortTestData, sortTestData.length)
                )
            )
        );

        // Insertion Sort: <--- THE HARDEST CURRENTLY
        System.out.println(
            Arrays.toString(
                insertionSort(
                    Arrays.copyOf(sortTestData, sortTestData.length)
                )
            )
        );

        // Bubble Sort:
        System.out.println(
            Arrays.toString(
                bubbleSort(
                    Arrays.copyOf(sortTestData, sortTestData.length)
                )
            )
        );

        // Binary Search (target value index is 11):
        System.out.println(
            binarySearch(
                Arrays.copyOf(searchTestData, searchTestData.length), 
                8698
            )
        );

        */

    }

}


