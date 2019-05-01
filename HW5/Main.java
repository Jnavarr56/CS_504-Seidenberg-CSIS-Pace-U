//https://stackoverflow.com/questions/4805606/how-to-sort-by-two-fields-in-java/45106675
import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Main {

    public static ArrayList<Email> sortByCompanyThenEmail(ArrayList<Email> emailsOrigin) { 

        ArrayList emails = (ArrayList) emailsOrigin.clone();

        Collections.sort(emails, new Comparator() {
                public int compare(Object email1, Object email2) {

                    String company1 = ((Email) email1).parseCompanyName();
                    String company2 = ((Email) email2).parseCompanyName();
                    int sComp = company1.compareTo(company2);
                    if (sComp != 0) return sComp;
        
                    String name1 = ((Email) email1).parseEmailName();
                    String name2 = ((Email) email2).parseEmailName();
                    return name1.compareTo(name2);
                }
            }
        );

        return emails;

    }

    public static ArrayList<Email> readEmails(String fileName) {
        ArrayList<Email> arr = new ArrayList<Email>();
        try {
            Scanner scan = new Scanner(new File(fileName));
            while (scan.hasNextLine()) {
                arr.add(new Email(scan.nextLine()));
            }   
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return arr;
    }

    private static void writeToFile(String results) {

        try  {

            FileWriter fileWriter = new FileWriter("./results.csv");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(results);
            printWriter.close();

            System.out.println("Wrote results to results.csv!");

        }

        catch(IOException e) {

            System.out.println(e);

        }

    }

    public static void main(String args[]) {

        ArrayList<Email> attendance = readEmails("./attendance.txt");
        attendance = sortByCompanyThenEmail(attendance);
        boolean billAttended = false;
        for (Email e : attendance) {
            System.out.println(e.parseCompanyName() + " " + e.parseEmailName());
            if (e.parseEmailName().equals("bill.gates")) {
                billAttended = true;
            }
        }

        System.out.println(billAttended ? "\nBILL ATTENDED!\n" : "");

        ArrayList<String> companys = new ArrayList<String>();
        ArrayList<String> companyCounts = new ArrayList<String>();

        int counter = 0;
        String company = attendance.get(0).parseCompanyName();
        for (Email e : attendance) {
            if (e.parseCompanyName().equals(company)) {
                counter++;
            } 
            else {
                companys.add(company);
                companyCounts.add("*".repeat(counter));
                company = e.parseCompanyName();
                counter = 1;
            }   
        }
        companys.add(company);
        companyCounts.add("*".repeat(counter));

        String col;
        for (int c = 0; c < companys.size(); c++) {
            col = companys.get(c) + ": ";
            System.out.println(" ".repeat(6 - col.length()) + col + companyCounts.get(c));
        }

        String results = "Company, First Name, Last Name, Email\n";
        String[] firstLast = new String[2];
        for (Email line : attendance) {;
            firstLast = line.parseEmailName().split("\\.");
            results += String.format(
                "%s,%s,%s,%s\n",
                line.parseCompanyName(),
                firstLast[0],
                firstLast[1],
                line.getEmailStr()
            );
            
        }

        writeToFile(results);

    }

}

