import java.util.*;

public class SelectionSort1 {

    private static int[] getMin(int[] arr, int startIdx) {

        int currentMin = arr[startIdx];

        int foundIdx = startIdx;

        for (int i = startIdx; i < arr.length; i++) {

            if (arr[i] < currentMin) {
                
                currentMin = arr[i];

                foundIdx = i;
            }

        }

        return new int[]{currentMin, foundIdx};

    }; 

    public static int[] selSortAscend(int[] arr) {

        System.out.printf("INPUT ARRAY:\n%s\n\n", Arrays.toString(arr));

        int temp, startIdx = 0;

        boolean done = false;

        int[] swapData;

        String oldArr, oldSubArr;

        while (!done) {

            oldArr = Arrays.toString(arr);

            oldSubArr = Arrays.toString(Arrays.copyOfRange(arr, startIdx, arr.length));

            swapData = getMin(arr, startIdx);

            temp = arr[startIdx];

            arr[startIdx] = swapData[0];

            arr[swapData[1]] = temp;

            System.out.printf(
                "Search Start Index: %d | Searching in: %s | Min Number Found: %d | Found at Index: %d\n" +
                "Swapping %d with %d: --> %s --> %s\n\n",
                startIdx,
                oldSubArr,
                swapData[0],
                swapData[1],
                temp,
                arr[startIdx],
                oldArr,
                Arrays.toString(arr)
            );

            startIdx++;

            if (startIdx == arr.length - 1) {

                done = true;

            }

        }

        return arr;

    }

}