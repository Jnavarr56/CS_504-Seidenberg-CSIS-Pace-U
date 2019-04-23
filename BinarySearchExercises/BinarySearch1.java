import java.util.*;

public class BinarySearch1 {

    public static boolean binary(int[] arr, int targetNum) {

        boolean complete = false;

        while (!complete) {

            int end = arr.length/2;

            if (targetNum < arr[end]) {

                arr = Arrays.copyOfRange(arr, 0, end);

            }

            else if (targetNum > arr[end]) {

                arr = Arrays.copyOfRange(arr, end, arr.length);

            }

            else {

                return true;

            }

            System.out.println(Arrays.toString(arr));

            if (arr.length == 1 && arr[0] != targetNum) complete = true;

        }
        
        return false;

    }

}