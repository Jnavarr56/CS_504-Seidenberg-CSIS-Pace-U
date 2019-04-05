import java.util.*;
import java.lang.*;

public class Student {

    private static ArrayList<Student> ALL_STUDENTS = new ArrayList<Student>();

    private String id;
    private int midtermExam;
    private int finalExam;
    private String level;

    private static void addStudent(Student student) {

        Student.ALL_STUDENTS.add(student);

    }

    private static String fetchNewestId() {

        return Long.toString(System.currentTimeMillis());

    }

    public static ArrayList<Student> viewRoster() {

        return Student.ALL_STUDENTS;

    }

    public Student(int midtermExam, int finalExam) {

        this.midtermExam = midtermExam;
        this.finalExam = finalExam;

        Student.addStudent(this);
        this.id = Student.fetchNewestId();

    }

    public Student() {

        Student.addStudent(this);
        this.id = Student.fetchNewestId();

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

    public static String displayRoster() {

        if (Student.ALL_STUDENTS.size() == 0) {

            return "There are currently no students in the class roster";

        }

        else {

            return (new StudentTable(Student.ALL_STUDENTS)).getTable();

        }

    } 

 }
 