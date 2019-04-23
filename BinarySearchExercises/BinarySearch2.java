import java.util.*;

public class BinarySearch2 {

    public static int[] binary(int[] arr, int targetNum) {

        int start = 0;

        int end = arr.length - 1;

        int mid;

        boolean complete = false;

        while (!complete) {

            mid = (start + end)/2;

            if (targetNum < arr[mid]) { end = mid; }

            else if (targetNum > arr[mid]) { start = mid; }

            else { return new int[]{arr[mid], mid}; }

            if (arr.length == 1) complete = true;

        }

        return new int[] {-1, -1};

    }

}