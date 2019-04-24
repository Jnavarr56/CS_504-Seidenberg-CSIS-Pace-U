import java.util.*;

public class InsertionSort1 {

    public InsertionSort1(int[] arr) {
        
        int temp;

        int end = 0;

        int shiftCount;

        while (end < arr.length) {

            if (arr[end] < arr[0]) {

                temp = arr[end];
                
                shiftCount = end;

                while (shiftCount > 0) {

                    arr[shiftCount] = arr[shiftCount - 1];

                    shiftCount--;

                }

                arr[0] = temp;

            }

            end++;

            System.out.println(Arrays.toString(arr));

        }

    }

}