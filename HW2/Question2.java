import java.util.*;
public class Question2 {

    public static void main(String args[])  {

        int[] counters = new int[51];

        Scanner scan = new Scanner(System.in);

        int input = 0;

        while(input != -1) {

            System.out.print("\nEnter a value between 0 and 50 [ -1 to end ]: ");

            input = scan.nextInt();

            if (input != -1) {

                counters[input]++; 

            }

        }

        for(int i = 0; i < counters.length; i++) {
            
            if (counters[i] > 0) {

                System.out.println("The value of " + i + " has " + counters[i] + " occurrences.");
            }
        
        }

    }

}