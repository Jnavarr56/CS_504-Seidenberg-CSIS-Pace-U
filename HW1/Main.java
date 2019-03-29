import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int numGrades;
        int cutoff;
        int scoreIndex = 0;

        int[] scores;

        System.out.print("\nEnter the number of grades to input: ");
        numGrades = scan.nextInt();

        scores = new int[numGrades];

        while (scoreIndex < numGrades) {

            System.out.print("\nEnter score #" + (scoreIndex + 1) + ": ");

            scores[scoreIndex] = scan.nextInt();

            scoreIndex++;

        }

        System.out.print("\nEnter the the fail cutoff: ");
        cutoff = scan.nextInt();

        System.out.println("\nRESULTS\n===================\n");
        
        Grades classExamGrades = new Grades(scores);

        String summaryStats = String.format(

            "- Highest Score: %d\n" +
            "- Lowest Score: %d\n" +
            "- Average Score: %f\n" +
            "- Failing Scores: %d\n" + 
            "- Histogram:%s",
            
            classExamGrades.highest(),
            classExamGrades.lowest(),
            classExamGrades.average(),
            classExamGrades.numOfFailingGrades(cutoff),
            classExamGrades.histogram()

        );

        System.out.println(summaryStats);

        System.out.println("\n\n===================\n");

    }

}