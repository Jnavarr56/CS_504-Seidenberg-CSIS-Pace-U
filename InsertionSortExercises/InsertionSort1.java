import java.util.*;

public class InsertionSort1 {

    public InsertionSort1(int[] arr) {

        int end = 0;

        int toInsert = arr[0];

        int shiftCount = 0;

        int temp = 0;

        boolean shouldShift;

        while (end < arr.length) {

            shouldShift = false;

            for (int i = 0; i <= end; i++) {

                if (arr[end] < arr[i]) {

                    toInsert = arr[end];

                    shouldShift = true;

                    break;

                }

            }

            if (shouldShift) {

                shiftCount = end;

                while (shiftCount > 0) {

                    temp = arr[shiftCount - 1];

                    arr[shiftCount] = temp;

                    System.out.println(arr[shiftCount]);

                    shiftCount--;

                }

                arr[0] = toInsert;
            }

            end++;

            System.out.println(Arrays.toString(arr));

        }

    }

}