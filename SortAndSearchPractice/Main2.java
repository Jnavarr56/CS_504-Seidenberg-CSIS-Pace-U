import java.util.*;

public class Main2 {

    private static int getMinIndex(int startSearchIdx, int[] arr) {

        int minIndex = startSearchIdx;

        for (int i  = startSearchIdx; i < arr.length; i++) {

            minIndex = arr[i] < arr[minIndex] ? i : minIndex;

        }

        return minIndex;
        
    }

    private static int[] selectionSort(int[] arr) {

        int minIdx;

        int temp;

        for(int i = 0; i < arr.length; i++) {

            minIdx = getMinIndex(i, arr);

            if (arr[minIdx] < arr[i]) {

                temp = arr[i];

                arr[i] = arr[minIdx];
                arr[minIdx] = temp;

            }
            

        }

        return arr;

    }

    public static int[] insertionSort(int arr[]) {

        int key;

        int y;
        
        for (int x = 1; x < arr.length; x++) {

            key = arr[x];
            y = x - 1;

            while ((y > -1) && arr[y] > key) {

                arr[y + 1] = arr[y];

                y--;

            }

            arr[y + 1] = key;

        }

        return arr;

    }  

    public static int[] bubbleSort(int arr[]) {  

        int temp;

        boolean done = false;

        while (!done) {

            done = true;

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i + 1] < arr[i]) {

                    done = false;
    
                    temp = arr[i];
    
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
    
                }
    
            }

        }

        return arr;

    }  

    public static int binarySearch(int arr[], int targetValue) {  

        int start = 0;

        int mid = arr.length/2;

        int end = arr.length -1;

        while (end - start > 1) {

            if (targetValue < arr[mid]) {

                end = mid;

            }

            else if (targetValue > arr[mid]) {

                start = mid;

            }

            else {

                return mid;

            }

            mid = (start + end)/2;

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

        

    }

}

