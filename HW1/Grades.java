import java.util.*;

public class Grades {

    private int[] values;
    private GradeRange[] ranges = {
        new GradeRange(90, 100),
        new GradeRange(80, 89),
        new GradeRange(70, 79),
        new GradeRange(60, 69),
        new GradeRange(60)
    };

    public Grades () {

    }

    public Grades (int[] myArray) {

        this.values = myArray;

    }

    public void setValues(int[] myArray) {

        this.values = myArray;

    }

    public int[] getValues() {

        return this.values;

    }

    public int highest() {

        int currentMax = this.values[0];

        for(int grade : this.values) {

            currentMax = grade > currentMax ? grade : currentMax; 

        }

        return currentMax;

    }

    public int lowest() {

        int currentMin = this.values[0];

        for(int grade : this.values) {

            currentMin = grade < currentMin ? grade : currentMin; 

        }

        return currentMin;

    }

    public int numOfGrades() {

        return this.values.length;

    }

    public double average() {

        int sum = 0;

        for (int grade : this.values) {

            sum += grade;

        }

        return (((double) sum)/this.values.length); 

    }

    public int numOfFailingGrades(int gradeValue) {

        int amtFailed = 0;

        for (int grade : this.values) {

            amtFailed = grade < gradeValue ? amtFailed + 1 : amtFailed;

        }

        return amtFailed;

    }

    public String histogram() {

        String histogramStr = "";

        for (int grade : this.values) {

            for (GradeRange range : this.ranges) {

                range.isInRange(grade);

            }

        }

        for (GradeRange range : this.ranges) {

            histogramStr += "\n" + range.showFreqStr();

        }

        return histogramStr;

    }

    
}