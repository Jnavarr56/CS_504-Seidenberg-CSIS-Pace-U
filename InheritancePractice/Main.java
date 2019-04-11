import java.util.*;
import java.io.File;

public class Main {

    public static void main(String args[]) {

        Child obj = new Child();

        obj.printChange();

        ArrayList hi = new ArrayList<Integer>();

        hi.add(new Integer(1));
        hi.add(new Integer(2));

        for(int i = 0; i < hi.size(); i++) {

            System.out.println(hi.get(i));

        }

    }


}