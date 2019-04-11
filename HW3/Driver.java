public class Driver {

    public static void main(String args[]) {
        
        Optimistic optimist = new Optimistic();
        Neutral apathetic = new Neutral();
        Pessimistic pessimist = new Pessimistic();

        System.out.println("Testing Optimist class:\n----------------------");
        optimist.speak();
        optimist.announce("pizza");
        System.out.println("");


        System.out.println("Testing Neutral class:\n----------------------");
        apathetic.speak();
        apathetic.announce("pizza");
        System.out.println("");


        System.out.println("Testing Pessimist class:\n----------------------");
        pessimist.speak();
        pessimist.announce("pizza");
        System.out.println("");
        
    }

}