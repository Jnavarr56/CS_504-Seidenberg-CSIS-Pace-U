public class ExceptionHandling1 {


    public static void main(String args[]) {

        try {

            int x = 5; 
            
            System.out.println(x / 0);

        } catch(ArithmeticException ae) {

            System.out.println("EXCEPTION TEXT:");
            System.out.println(ae);

        }



    }

}