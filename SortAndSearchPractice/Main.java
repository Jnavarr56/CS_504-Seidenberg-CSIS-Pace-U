
import java.util.*;

public class Main {

    private static int getMinIndex(int startSearchIdx, int[] arr) {

        int currentMinIndex = startSearchIdx;

        for (int i = startSearchIdx + 1; i < arr.length; i++) {

            currentMinIndex = arr[i] < arr[currentMinIndex] ? i : currentMinIndex;

        }

        return currentMinIndex;
        
    }

    private static int[] selectionSort(int[] arr) {

        int temp, minIndex;

        for (int i = 0; i < arr.length; i++) {

            minIndex = getMinIndex(i, arr);
            temp = arr[minIndex];

            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        return arr;

    }

    public static int[] insertionSort(int arr[]) {  

        for (int j = 1; j < arr.length; j++) {  

            int key = arr[j];  

            int i = j - 1;  

            while ((i > -1) && (arr[i] > key)) {  

                arr [i + 1] = arr [i];  

                i--;  
            }  

            arr[i+1] = key;  

        }
        
        return arr;
    }  

    

    public static int[] bubbleSort(int arr[]) {  

        int temp;

        boolean done = false;

        while (!done) {

            done = true;

            for(int x = 0; x < arr.length - 1; x++) {

                if (arr[x + 1] < arr[x]) {
    
                    done = false;
    
                    temp = arr[x];
    
                    arr[x] = arr[x + 1];
    
                    arr[x + 1] = temp;
    
                }
    
            }
            
        }

        return arr;

    }  

    public static int binarySearch(int arr[], int targetValue) {  

        int start = 0;

        int mid = arr.length/2;

        int end = arr.length - 1;

        while (end - start > 1) {

            if (targetValue < arr[mid]) {

                end = mid;
    
                mid = (start + end)/2;
    
            }
    
            else if (targetValue > arr[mid]) {
    
                start = mid;
    
                mid = (start + end)/2;
    
            }

            else {

                return mid;

            }

            System.out.println( 
                Arrays.toString( Arrays.copyOfRange(arr, start, end + 1) ) 
            );

        }

        if (arr[start] == targetValue) {

            return start;

        }

        else if (arr[end] == targetValue) {

            return end;

        }

        else {

            return -1;

        }

    }  

    
    public static void main(String[] args) {

        int[] sortTestData = {55, 23, 62, 3, 1, 79, 100, 5000, 5, 1, 12, 67, 4000, 231};

        int[] searchTestData = {1, 2, 3, 4, 5, 78, 200, 335, 1002, 40038, 6666, 8698, 11432, 50000};

        // Selection Sort:
        System.out.println(Arrays.toString(selectionSort(Arrays.copyOf(sortTestData, sortTestData.length))));

        // Insertion Sort: <--- THE HARDEST CURRENTLY
        System.out.println(Arrays.toString(insertionSort(Arrays.copyOf(sortTestData, sortTestData.length))));

        // Bubble Sort:
        System.out.println(Arrays.toString(bubbleSort(Arrays.copyOf(sortTestData, sortTestData.length))));

        
        // Binary Search (target value index is 11):
        System.out.println(binarySearch(Arrays.copyOf(searchTestData, searchTestData.length), 8698));

        
    }

}
