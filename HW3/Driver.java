import java.lang.*;

public class Driver {

    public static void main(String args[]) {

        // Since each class implements the Speaker interface,
        // they all are instances of the Speaker interface 
        // (in addition being instances of their actual classes) 
        // and therefore can all be in an array that holds references to
        // Speaker instances, despite being of different classes.
        Speaker[] instances = new Speaker[]{
            new Optimistic(), 
            new Neutral(), 
            new Pessimistic()
        };

        System.out.println("\nTHE FOLLOWING ARE ALL INSTANCES OF THE SPEAKER INTERFACE\n\n");


        // Since they all implement the same interface
        // we know they must share the same methods.
        // Even though they are of difference
        // classes, we can call
        // the same method on each item in the array
        // and know that each object will definitely
        // have that method defined for itself.
        for (int s = 0; s < instances.length; s++) {

            System.out.printf(
                "Testing the %s Class Instance----------------------\n",
                instances[s].getClass().getName()
            ); 

            instances[s].speak();
            instances[s].announce("pizza");

            System.out.println("\n");

        }
        
    }

}