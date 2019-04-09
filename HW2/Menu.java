public class Menu {

    private static String menu = 
        "1) Add a student to the roster\n" +
        "2) Delete a student from the roster\n" +
        "3) Edit a student's info.\n" + 
        "4) Exit";

    private static int dashExitOption = 4;

    // This method will print the roster and menu options.
    public static void showDashboard() {

        System.out.print(

            String.format(
                "\n%s\n%s\n%s\n%s\n> Your Selection: ",
                "=".repeat(75), 
                Student.displayRoster(), 
                Menu.menu, 
                "-".repeat(75),
                "\n Your Selection: "
            )

        );

    }

    // This method returns true if the user input for the menu selection is valid, otherwise returns false.
    public static boolean isValidDashInput(String input) {

        if (!Helpers.isNumeric(input) || (Integer.parseInt(input) < 1 || Integer.parseInt(input) > Menu.dashExitOption)) {

            return false;

        }

        return true;

    }

    public static void invalidDashInputMsg(int numPeriods, int delay, String symbolStr) {

        System.out.print("   * Not a valid selection. Returning to dashboard");
        Helpers.generateLoadingSymbols(numPeriods, delay, symbolStr);

    }

    public static boolean isDashExitOption(String input) {

        return Menu.isValidDashInput(input) ? (Integer.parseInt(input) == Menu.dashExitOption) : false;

    }

    public static boolean isValidCharInput(char input, char[] values) {

        for(char c : values) {

            if (c == input) { 

                return true;

            }

        }

        return false;

    }

    public static boolean isValidIntInput(String input, int lowerBound, int upperBound) {

        if (!Helpers.isNumeric(input) || (Integer.parseInt(input) < lowerBound || Integer.parseInt(input) > upperBound)) {

            return false;

        }

        return true;

    }

    public static void invalidDataInputMsg(int numPeriods, int delay, String symbolStr) {

        System.out.print("            +++ Not a valid input. Please try again");
        Helpers.generateLoadingSymbols(numPeriods, delay, symbolStr);

    }


    public static void invalidDataInputMsg(int numPeriods, int delay, String symbolStr, int lvl) {

        System.out.print("                 ++++ Not a valid input. Please try again");
        Helpers.generateLoadingSymbols(numPeriods, delay, symbolStr);

    }

    public static void cancelledProcess(int numPeriods, int delay, String symbolStr) {

        System.out.print("            +++ Process cancelled. Returning to dashboard");
        Helpers.generateLoadingSymbols(numPeriods, delay, symbolStr);

    }

    public static boolean isValidStrInput(String input, String[] values) {

        for(String s : values) {

            if (s.equals(input)) { 

                return true;

            }

        }
        return false;

    }


}