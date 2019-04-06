import java.util.*;
import java.lang.*;

public class CreateStudent {

    public static void run()  {

        System.out.print("> ");
        Helpers.typeEffect("L O A D I N G\n", 100);
        Helpers.delay(250);
        System.out.println("> ADDING A NEW STUDENT:\n -----------------------");

        Scanner scan = new Scanner(System.in);

        char lvlInput = 'a';
        while (!Menu.isValidCharInput(lvlInput, new char[] {'g', 'u'})) {
        
            System.out.println("\n    * (1/4) Set Student Level:");
            System.out.print("        ++ Enter G or g for graduate, U or u for undergraduate: ");

            lvlInput = scan.next().toLowerCase().charAt(0);

            if (!Menu.isValidCharInput(lvlInput, new char[] {'g', 'u'})) {

                Menu.invalidDataInputMsg(10, 300, ".");

            }

        }

        String midtermInput = "-1";
        while (!Menu.isValidIntInput(midtermInput, 0, 100)) {
        
            System.out.println("\n    * (2/4) Enter Student Midterm Exam score:");
            System.out.print("        ++ Must be between 0 and 100 (inclusive): ");

            midtermInput = scan.next();

            if (!Menu.isValidIntInput(midtermInput, 0, 100)) {

                Menu.invalidDataInputMsg(10, 300, ".");

            }

        }

        String finalInput = "-1";
        while (!Menu.isValidIntInput(finalInput, 0, 100)) {
        
            System.out.println("\n    * (3/4) Enter Student Final Exam score:");
            System.out.print("        ++ Must be between 0 and 100 (inclusive): ");

            finalInput = scan.next();

            if (!Menu.isValidIntInput(midtermInput, 0, 100)) {

                Menu.invalidDataInputMsg(10, 300, ".");

            }

        }

        char conf = 'a';

        while (!Menu.isValidCharInput(conf, new char[] {'y', 'n'})) {

            System.out.println("\n    * (4/3) Are you sure you want to add this student?:");
            System.out.print("        ++ Enter Y or y to confirm. Enter N or n to cancel: ");

            conf = scan.next().toLowerCase().charAt(0);

            if (!Menu.isValidCharInput(conf, new char[] {'y', 'n'})) {

                Menu.invalidDataInputMsg(10, 300, ".");

            }

        }

        if (conf == 'y') {

            String newStudentId;

            if (lvlInput == 'g') {

                GraduateStudent gradStudent = new GraduateStudent(Integer.parseInt(midtermInput), Integer.parseInt(finalInput));
                newStudentId = gradStudent.getId();

            }

            else {

                UnderGraduateStudent undergradStudent = new UnderGraduateStudent(Integer.parseInt(midtermInput), Integer.parseInt(finalInput));
                newStudentId = undergradStudent.getId();

            }

            System.out.print("\n    * ");
            Helpers.typeEffect("A D D I N G   S T U D E N T", 100);
            Helpers.delay(250);
            System.out.println("\n\nDone. Added student with ID " + newStudentId + "!\n");
            Helpers.delay(500);
            
        }

        else {

            Menu.cancelledProcess(10, 300, ".");

        }

    }

}