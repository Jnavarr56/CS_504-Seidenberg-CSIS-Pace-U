import java.util.*;
import java.lang.*;

public class Helpers {

    // This method returns true if a string is a number, otherwise returns false.
    public static boolean isNumeric(String strNum) {

        try {
    
            double d = Double.parseDouble(strNum);
    
        } 
        catch (NumberFormatException | NullPointerException nfe) {
    
            return false;
        }
    
        return true;
    
    }

    // This method produces a delay of a certain amount of ms.
    public static void delay(int delay) {

        try { Thread.sleep(delay); } 

        catch (Exception e) { System.out.println(e); }

    }

    // This method produces an extended elipsis to simulate a loading animation.
    public static void generateLoadingSymbols(int numPeriods, int delay, String symbolStr) {

        int i = 0;

        while (i < numPeriods) {

            System.out.print(symbolStr);

            delay(delay);

            i ++;

        }

    }

    public static void typeEffect(String phrase, int delay) {

        for (int l = 0; l < phrase.length(); l++) {

            System.out.print(phrase.charAt(l));

            delay(delay);

        }

    }

    public static void displayArt() {

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

    }

}