import java.util.*;
import java.lang.*;

public class UpdateStudent {

    public static void run()  {

        System.out.print("> ");
        Helpers.typeEffect("L O A D I N G\n", 100);
        Helpers.delay(250);
        System.out.println("> UPDATING A STUDENT:\n ---------------------\n");

        Scanner scan = new Scanner(System.in);

        String idInput = "not";
        char conf;
        while (!Student.studentExists(idInput)) {
        
            System.out.println("    * (1/5) Select Student:");
            System.out.print("       ++ Enter ID of student to update: ");

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

        Student student = Student.fetchStudent(idInput);
        System.out.println(
            "       ++ STUDENT LOCATED => ID: " + student.getId() + 
            "; Midterm: " + student.getMidtermExam() + 
            "; Final: " + student.getFinalExam() + 
            "; Average: " + String.format("%.2f", student.calcAvg()) + 
            "; Letter Grade: " + student.getLetterGrade() + 
            "; Level: " + student.getLevel()
        );

        String newLvl = "a";
        while (!Menu.isValidStrInput(newLvl, new String[] {"g", "u", "-1"})) {
        
            System.out.println("\n    * (2/5) Edit Student Level:");
            System.out.print("        ++ Enter G or g for graduate, U or u for undergraduate, -1 to keep the original: ");

            newLvl = scan.next().toLowerCase();

            if (!Menu.isValidStrInput(newLvl, new String[] {"g", "u", "-1"})) {

                Menu.invalidDataInputMsg(10, 300, ".");

            }

        }

        String newMidterm = "-2";
        while (!Menu.isValidIntInput(newMidterm, -1, 100)) {
        
            System.out.println("\n    * (3/5) Edit Midterm Exam score:");
            System.out.print("        ++ Must be between 0 and 100 (inclusive), Enter -1 to keep the original: ");

            newMidterm = scan.next();

            if (!Menu.isValidIntInput(newMidterm, -1, 100)) {

                Menu.invalidDataInputMsg(10, 300, ".");

            }

        }

        String newFinal = "-2";
        while (!Menu.isValidIntInput(newFinal, -1, 100)) {
        
            System.out.println("\n    * (4/5) Edit Final Exam score:");
            System.out.print("        ++ Must be between 0 and 100 (inclusive), Enter -1 to keep the original: ");

            newFinal = scan.next();

            if (!Menu.isValidIntInput(newFinal, -1, 100)) {

                Menu.invalidDataInputMsg(10, 300, ".");

            }

        }

        System.out.println("    * (5/5) Are you sure you want to update this student with these values?:");

        String newValuesSummary = "       ++ NEW VALUES =>";

        if (!newMidterm.equals("-1")) {

            newValuesSummary += " Midterm: " + newMidterm + ";";
        }

        if (!newFinal.equals("-1")) {

            newValuesSummary += " Final: " + newFinal + ";";
        }

        if (!newLvl.equals("-1")) {

            newValuesSummary += " Level: " + newLvl;
        }


        System.out.println(newValuesSummary);

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

            if (!newMidterm.equals("-1")) {

                student.setMidtermExam(Integer.parseInt(newMidterm));

            }

            if (!newFinal.equals("-1")) {

                student.setFinalExam(Integer.parseInt(newFinal));

            }

            System.out.print("\n    * ");
            Helpers.typeEffect("U P D A T I N G   S T U D E N T", 100);
            Helpers.delay(250);
            System.out.println("\n\nDone. Updated student with ID " + idInput + "!\n");
            Helpers.delay(500);

        }
        
    }

}