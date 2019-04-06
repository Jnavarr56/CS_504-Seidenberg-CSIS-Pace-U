import java.util.*;
import java.lang.*;

public class Question1 {

    public static void main(String args[]) {     
        
        Helpers.displayArt();

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

                    CreateStudent.run();
    
                }
    
                else if (Student.viewRoster().size() > 0) {

                    if (userDashInput.equals("2")) { 

                        DeleteStudent.run(); 

                    }
    
                }

            }

        }  

    }

}