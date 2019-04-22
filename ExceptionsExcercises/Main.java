public class Main {

    public static void DoesNotAcceptTheLetterA(char letter) throws MyCustomException {
        if (letter != 'a') {

            System.out.println("WOO NO EXCEPTION");

        }

        else {

            throw new MyCustomException("WARNING: LETTER A ILLEGAL");

        }


    }

    public static void main(String args[]) {

        try {

            DoesNotAcceptTheLetterA('a');

        }

        catch(MyCustomException e) {

            System.out.println(e);

        }
    
    }

}