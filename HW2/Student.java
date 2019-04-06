import java.util.*;
import java.lang.*;

public class Student {

    private static ArrayList<Student> ALL_STUDENTS = new ArrayList<Student>();
     
    private static String[] fieldNames = {
        "      ID #:      ", 
        "      Level       ", 
        "      Midterm Score:      ", 
        "      Final Score:      ", 
        "      Average:      ",
        "      Letter Grade:      "
    };

    private String id;
    private int midtermExam;
    private int finalExam;
    private String level;

    private static void addStudent(Student student) {

        Student.ALL_STUDENTS.add(student);

    }

    public static ArrayList<Student> viewRoster() {

        return Student.ALL_STUDENTS;

    }

    public static void deleteStudentByID(String searchId) {

        ArrayList<Student> roster = Student.ALL_STUDENTS;
    
        for(int s = 0; s < roster.size(); s++) {

            if (roster.get(s).getId().equals(searchId)) {

                Student.ALL_STUDENTS.remove(s);

            }

        }

    }

    public Student(int midtermExam, int finalExam) {

        this.midtermExam = midtermExam;
        this.finalExam = finalExam;

        Student.addStudent(this);
        this.id = Long.toString(System.currentTimeMillis());

    }

    public Student() {

        Student.addStudent(this);
        this.id = Long.toString(System.currentTimeMillis());

    }

    public void setMidtermExam(int midtermExam) {

        this.midtermExam = midtermExam;

    }

    public void setFinalExam(int finalExam) {

        this.finalExam = finalExam;

    }

    public void setLevel(String level) {

        this.level = level;

    }

    public void setId(String id) {

        this.id = id;

    }

    public int getMidtermExam() {

        return this.midtermExam;

    }

    public int getFinalExam() {

        return this.finalExam;

    }

    public String getId() {

        return this.id;

    }

    public String getLevel() {

        return this.level;

    }
 
    public double calcAvg() {

       double avg;
       avg = (midtermExam + finalExam) / 2.0;

       return avg;

    }
 
    public char getLetterGrade() {

       char letterGrade = 'F';

       return letterGrade;

    }

    private static String generateCellSpace(String fieldName, String value) {

        String leftSpace = " ".repeat((fieldName.length() - value.length()) / 2);
        String rightSpace = " ".repeat(fieldName.length() - (leftSpace.length() + value.length()));

        return leftSpace + value + rightSpace;

    }

    private static String generateCellSpace(String fieldName, double value) {

        String valueAsStr = String.format("%.2f", value);

        String leftSpace = " ".repeat((fieldName.length() - valueAsStr.length()) / 2);
        String rightSpace = " ".repeat(fieldName.length() - (leftSpace.length() + valueAsStr.length()));

        return leftSpace + valueAsStr + rightSpace;

    }
    
    public static String getTable() {

        String headerRow = "||" + String.join("|", fieldNames) + "||";
        String dataRows = "";
        String table = "";

        for (Student student : Student.viewRoster()) {

            dataRows += String.format(
                "||%s|%s|%s|%s|%s|%s||\n%s",
                generateCellSpace(Student.fieldNames[0], student.getId()),
                generateCellSpace(Student.fieldNames[1], student.getLevel()),
                generateCellSpace(Student.fieldNames[2], Integer.toString(student.getMidtermExam())),
                generateCellSpace(Student.fieldNames[3], Integer.toString(student.getFinalExam())),
                generateCellSpace(Student.fieldNames[4], student.calcAvg()),
                generateCellSpace(Student.fieldNames[5], Character.toString(student.getLetterGrade())),
                "-".repeat(headerRow.length()) + "\n"
            ); 
                                       
        }

        table = String.format(
            "%s\n%s\n%s\n%s",
            "=".repeat(headerRow.length()),
            headerRow,
            "=".repeat(headerRow.length()),
            dataRows
        );

        return "\nSTUDENT ROSTER AND OPTIONS\n" + table;

    }


    public static String displayRoster() {

        return Student.ALL_STUDENTS.size() == 0 ? "There are currently no students in the roster." : Student.getTable(); 

    } 

    public static boolean studentExists(String searchId) {

        ArrayList<Student> roster = Student.ALL_STUDENTS;
    
        for(int s = 0; s < roster.size(); s++) {

            if (roster.get(s).getId().equals(searchId)) {

                return true;

            }

        }

        return false;

    }

    public static Student fetchStudent(String searchId) {

        ArrayList<Student> roster = Student.ALL_STUDENTS;
    
        for(int s = 0; s < roster.size(); s++) {

            if (roster.get(s).getId().equals(searchId)) {

                return roster.get(s);

            }

        }

        return roster.get(0);

    }

 }
 