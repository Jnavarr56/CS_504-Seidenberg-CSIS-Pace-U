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

        String[] colHeaders = {"Highest Score", "Lowest Score", "Average Score", "# of Failing Scores"};
        String[] colValues = {
            Integer.toString(classExamGrades.highest()),
            Integer.toString(classExamGrades.lowest()), 
            String.format("%.2f", classExamGrades.average()),
            Integer.toString(classExamGrades.numOfFailingGrades(cutoff)), 
        };   

        System.out.println("------------------------------------------------------------------------");

        String headerRow = "||";
        String row = "||";
        String leftCellSpace = "";
        String rightCellSpace = "";
        
        for (int c = 0; c < colHeaders.length; c++) {

            headerRow += String.format(" %s |", colHeaders[c]);

            leftCellSpace = " ".repeat(((colHeaders[c].length() + 2) - colValues[c].length()) / 2);

            rightCellSpace = " ".repeat((colHeaders[c].length() + 2) - (leftCellSpace.length() + colValues[c].length()));

            row += String.format("%s|",  leftCellSpace + colValues[c] + rightCellSpace);

        }

        headerRow += "|";
        row += "|";

        System.out.println(headerRow);

        System.out.println("||---------------|--------------|---------------|---------------------||");

        System.out.println(row);

        System.out.println("||---------------|--------------|---------------|---------------------||");

        System.out.println(classExamGrades.histogram());

        System.out.println("\n===================\n");

    }

}