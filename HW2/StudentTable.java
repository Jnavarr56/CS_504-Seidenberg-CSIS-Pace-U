import java.util.*;

public class StudentTable {
 
    private String[] fieldNames = {
        "   ID #:   ", 
        "   Level    ", 
        "   Midterm Score:   ", 
        "   Final Score:   ", 
        "   Average:   "
    };

    private String headerRow = "||" + String.join("|", fieldNames) + "||";

    private String dataRows = "";

    private String table = "";

    private String generateCellSpace(String fieldName, String value) {

        String leftSpace = " ".repeat((fieldName.length() - value.length()) / 2);
        String rightSpace = " ".repeat(fieldName.length() - (leftSpace.length() + value.length()));

        return leftSpace + value + rightSpace;

    }
    
    public StudentTable(ArrayList<Student> roster) {

        String row;

        for (Student student : roster) {

            dataRows += "||" +
                        generateCellSpace(this.fieldNames[0], student.getId()) + "|" +
                        generateCellSpace(this.fieldNames[1], student.getLevel()) + "|" + 
                        generateCellSpace(this.fieldNames[2], Integer.toString(student.getMidtermExam())) + "|" + 
                        generateCellSpace(this.fieldNames[3], Integer.toString(student.getFinalExam())) + "|" +
                        generateCellSpace(this.fieldNames[4], Double.toString(student.calcAvg())) + "|" +
                        "||\n"; 

        }

        table = headerRow + "\n" + dataRows;

    }

    public String getTable() {

        return table;

    }

}