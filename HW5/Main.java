//https://stackoverflow.com/questions/4805606/how-to-sort-by-two-fields-in-java/45106675
import java.util.*;
import java.io.*;

public class Main {

    public static ArrayList<Email> sortByCompanyThenEmail(ArrayList<Email> emailsOrigin) { 

        ArrayList emails = (ArrayList) emailsOrigin.clone();

        Collections.sort(emails, new Comparator() {

                public int compare(Object email1, Object email2) {

                    String company1 = ((Email) email1).parseCompanyName();
                    String company2 = ((Email) email2).parseCompanyName();
                    int sComp = company1.compareTo(company2);
        
                    if (sComp != 0) {
                        return sComp;
                    } 
        
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

    public static void main(String args[]) {

        ArrayList<Email> attendance = readEmails("attendance.txt");
        attendance = sortByCompanyThenEmail(attendance);

        for (Email e : attendance) {

            System.out.println(e.parseCompanyName() + " " + e.parseEmailName());

        }
    
    }

}