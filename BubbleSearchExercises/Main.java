import java.util.*;

public class Main {

    public static void main(String args[]) {

        int[] testData = {5, 4, 3, 2, 1};

        boolean done = false;

        int temp;

        while (!done) {

            done = true;

            System.out.println(Arrays.toString(testData));

            for (int i = 0; i < testData.length - 1; i++) {
    
                if (testData[i + 1] < testData[i]) {

                    done = false;

                    temp = testData[i + 1];

                    testData[i + 1] = testData[i];

                    testData[i] = temp;

                }
    
            }

        }

    }

}