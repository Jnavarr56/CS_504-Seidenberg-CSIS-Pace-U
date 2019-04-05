import java.util.*;

public class Main {

    public static void main(String args[]) {

        String menu =  "1) Add students to the class roster\n2) Delete a student from the class roster\n3) Change as student's level.";

        
        

        GraduateStudent testGradStudent = new GraduateStudent(70, 85);
        UnderGraduateStudent testUnderGradStudent = new UnderGraduateStudent(85, 96);

        for(Student student: Student.viewRoster()) {

            System.out.println(student.getLevel());
            
        }

    }

}