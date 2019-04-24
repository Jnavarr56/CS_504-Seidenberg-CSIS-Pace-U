import java.util.*;

public class Main {

    public static void main(String args[]) {

        int[] testData = {65, 32, 400, 33, 1};

        boolean done = false;

        int temp;

        while (!done) {

            done = true;

            System.out.println(Arrays.toString(testData));

            for (int i = 0; i < testData.length - 1; i++) {
    
                if (testData[i + 1] < testData[i]) {

                    done = false;

                    System.out.printf(
                        "Switching %d with %d\n", 
                        testData[i], 
                        testData[i + 1]
                    );

                    temp = testData[i + 1];

                    testData[i + 1] = testData[i];

                    testData[i] = temp;

                }
    
            }

            System.out.println("");

        }

    }

}