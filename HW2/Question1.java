import java.util.*;

public class Question1 {

    private static void showDashboard() {

        String menu =  "1) Add a student to the class roster\n2) Delete a student from the class roster\n3) Edit a student's info.\n4) Exit";

        System.out.println("");
        System.out.println(Student.displayRoster());
        System.out.println(menu);
        System.out.print("\n Your Selection: ");

    }

    public static void main(String args[]) {        

        System.out.println("");
        System.out.println("");

        Scanner scan = new Scanner(System.in);

        int menuInput = 0;

        while(menuInput != 4) {

            showDashboard();

            menuInput = scan.nextInt();
    
            if (menuInput == 1) {

                System.out.println("\nAdding New Student:");

                char levelInput;
                int midtermExamInput;
                int finalExamInput;

                System.out.print("\n    * Enter \"G\" or \"g\" to add a graduate student, \"U\" or \"u\" for an undergraduate student: ");

                levelInput = scan.next().toLowerCase().charAt(0);

                if (levelInput == 'g') {

                    GraduateStudent student = new GraduateStudent();

                    System.out.print("    * Enter the student's final exam grade: ");
                    midtermExamInput = scan.nextInt();
                    student.setMidtermExam(midtermExamInput);

                    System.out.print("    * Enter the student's midterm exam grade: ");
                    finalExamInput = scan.nextInt();
                    student.setFinalExam(finalExamInput);

                }

                else if (levelInput == 'u') {

                    UnderGraduateStudent student = new UnderGraduateStudent();

                    System.out.print("    * Enter the student's final exam grade: ");
                    midtermExamInput = scan.nextInt();
                    student.setMidtermExam(midtermExamInput);

                    System.out.print("    * Enter the student's midterm exam grade: ");
                    finalExamInput = scan.nextInt();
                    student.setFinalExam(finalExamInput);

                }

            }

            else if (menuInput == 2) {

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

            else if (menuInput == 3) {

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