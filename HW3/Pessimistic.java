public class Pessimistic implements Speaker {

    private String msg = "If you expect the worst, you'll never be disappointed.";

    public void speak() {

        System.out.println(msg);

    }

    public void announce(String str) {

        str = str.trim();

        System.out.println(Character.toString(str.charAt(0)).toUpperCase() + str.substring(1)  + " is the worst!");

    }

}