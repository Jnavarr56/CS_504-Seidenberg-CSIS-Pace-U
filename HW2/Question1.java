import java.util.*;
import java.lang.*;

public class Question1 {

    public static void main(String args[]) {     
        
        String[] startUpArt = {
            " _   _                                         _      ____ ",
            "| | | | ___  _ __ ___   _____      _____  _ __| | __ |___ \\ ",
            "| |_| |/ _ \\| '_ ` _ \\ / _ \\ \\ /\\ / / _ \\| '__| |/ /   __) |",
            "|  _  | (_) | | | | | |  __/\\ V  V / (_) | |  |   <   / __/",
            "|_| |_|\\___/|_| |_| |_|\\___| \\_/\\_/ \\___/|_|  |_|\\_\\ |_____|",
            "\n",
            "   __             __                    _  __                          ",
            "  / /  __ __  __ / /__  _______ ____   / |/ /__ __  _____ ____________ ",
            " / _ \\/ // / / // / _ \\/ __/ _ `/ -_) /    / _ `/ |/ / _ `/ __/ __/ _ \\",
            "/_.__/\\_, /  \\___/\\___/_/  \\_, /\\__/ /_/|_/\\_,_/|___/\\_,_/_/ /_/  \\___/",
            "     /___/                /___/                                        ",
        };

        for (String asciiLine : startUpArt) {

            Helpers.typeEffect(asciiLine + "\n", 10);

        }



        Scanner scan = new Scanner(System.in);
        String userDashInput = "0";

        while (!Menu.isDashExitOption(userDashInput)) {

            Menu.showDashboard();
            userDashInput = scan.next().trim();

            if (!Menu.isValidDashInput(userDashInput)) {

                Menu.invalidDashInputMsg(10, 300, ".");

            }

            else {

                if (userDashInput.equals("1")) {

                    System.out.print("> ");
                    Helpers.typeEffect("L O A D I N G\n", 100);
                    Helpers.delay(250);
                    System.out.println("> ADDING A NEW STUDENT:\n -----------------------");

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
    
                else if (userDashInput.equals("2".trim())) {
    
                    System.out.println("\nDeleting a Student:");
    
                    System.out.print("\n    * Please enter the ID of the student to delete: ");
    
                    String searchID = scan.next();
    
                    ArrayList<Student> roster = Student.viewRoster();
    
                    boolean found = false;
    
                    for(int s = 0; s < roster.size(); s++) {
    
                        if (roster.get(s).getId().equals(searchID)) {
    
                            found = true;
    
                            System.out.println("    * Student Found! ID: " + roster.get(s).getId() + "; Level: " + roster.get(s).getLevel() + "; Average: " +  roster.get(s).calcAvg());
                            System.out.print("    * Are you sure you want to delete this student? This is permanent. [Yy/Nn]: ");
    
                            char delConf = scan.next().toLowerCase().charAt(0);
    
                            if (delConf == 'y') {
    
                                Student.deleteFromRoster(s);
                                System.out.println("    * Deleted student " + searchID + "!");
    
                            }
    
                            break;
    
                        }
    
                    }
    
                    if (!found) {
    
                        System.out.print("    * Could not find student from this ID. Returning to menu.");
    
                    }
    
                }
    
                else if (userDashInput.equals("3".trim())) {
    
                    System.out.println("\nEditing a Student:");
    
                    System.out.print("\n    * Please enter the ID of the student to edit: ");
    
                    String searchID = scan.next();
    
                    ArrayList<Student> roster = Student.viewRoster();
    
                    boolean found = false;
    
                    for(int s = 0; s < roster.size(); s++) {
    
                        if (roster.get(s).getId().equals(searchID)) {
    
                            found = true;
    
                            System.out.println("    * Student Found! ID: " + roster.get(s).getId() + "; Average: " +  roster.get(s).calcAvg());
    
                            System.out.print("    * Current Level: " + roster.get(s).getLevel() + "; Enter the new level [Gg/Uu] or [Zz] to keep it the same: ");
                            char levelInput = scan.next().toLowerCase().charAt(0);
    
                            System.out.print("    * Current Midterm Exam Score: " + roster.get(s).getMidtermExam() + "; Enter the new score or -1 to keep it the same: ");
                            int midtermExamInput = scan.nextInt();
    
                            System.out.print("    * Current Final Exam Score: " + roster.get(s).getFinalExam() + "; Enter the new score or -1 to keep it the same: ");
                            int finalExamInput = scan.nextInt();
                            
            
                            System.out.print("    * Are you sure you want to make these changes? [Yy/Nn]: ");
    
                            char editConf = scan.next().toLowerCase().charAt(0);
    
                            if (editConf == 'y') {
                                
                                //Figure out how to replace old obj with new object in case level is changed."
                                
                                roster.get(s).setLevel(levelInput == 'z' ? roster.get(s).getLevel() : (levelInput == 'u' ? "UNDERGRADUATE" : "GRADUATE"));
                                roster.get(s).setMidtermExam(midtermExamInput == -1 ? roster.get(s).getMidtermExam() : midtermExamInput);
                                roster.get(s).setFinalExam(finalExamInput == -1 ? roster.get(s).getFinalExam() : finalExamInput);
                                
                                System.out.println("    * Edited student " + searchID + "!");
    
                            }
    
                            break;
    
                        }
    
                    }
    
                    if (!found) {
    
                        System.out.print("    * Could not find student from this ID. Returning to menu.");
    
                    }
    
                }

            }

        }  

    }

}