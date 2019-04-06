import java.util.*;
import java.lang.*;

public class DeleteStudent {

    public static void run()  {

        System.out.print("> ");
        Helpers.typeEffect("L O A D I N G\n", 100);
        Helpers.delay(250);
        System.out.println("> DELETING A STUDENT:\n ---------------------\n");

        Scanner scan = new Scanner(System.in);

        String idInput = "not";
        char conf;
        while (!Student.studentExists(idInput)) {
        
            System.out.println("    * (1/2) Select Student:");
            System.out.print("       ++ Enter ID of student to delete: ");

            idInput = scan.next().trim();

            if (!Student.studentExists(idInput)) {

                conf = 'a';
                while (!Menu.isValidCharInput(conf, new char[] {'y', 'n'}))  {

                    System.out.println("            +++ Could not locate student from the ID you entered.");
                    System.out.print("            +++ Want to re-enter the ID? Enter Y or y to try again. Enter N or n to cancel: ");
    
                    conf = scan.next().trim().toLowerCase().charAt(0);

                    if (!Menu.isValidCharInput(conf, new char[] {'y', 'n'})) {

                        Menu.invalidDataInputMsg(10, 300, ".", 3);

                        System.out.print("\n");

                    }

                }

                if (conf == 'n') {

                    Menu.cancelledProcess(10, 300, ".");

                    return;

                }

            }

            else {

                System.out.print("\n");

            }

        }

        System.out.println("    * (2/2) Are you sure you want to delete this student?:");

        Student student = Student.fetchStudent(idInput);
        System.out.println("       ++ ID: " + student.getId() + "; Average: " + String.format("%.2f", student.calcAvg()) + "; Letter Grade: " + student.getLetterGrade());
        
        conf = 'a';
        while (!Menu.isValidCharInput(conf, new char[] {'y', 'n'}))  {
            
            System.out.print("       ++ Enter Y or y to confirm. Enter N or n to cancel: ");

            conf = scan.next().trim().toLowerCase().charAt(0);

            if (!Menu.isValidCharInput(conf, new char[] {'y', 'n'})) {

                Menu.invalidDataInputMsg(10, 300, ".");

                System.out.print("\n");
                
            }

        }
        
        if (conf == 'y') {

            Student.deleteStudentByID(idInput);

            System.out.print("\n    * ");
            Helpers.typeEffect("D E L E T I N G   S T U D E N T", 100);
            Helpers.delay(250);
            System.out.println("\n\nDone. Deleted student with ID " + idInput + "!\n");
            Helpers.delay(500);

        }
        
    }

}