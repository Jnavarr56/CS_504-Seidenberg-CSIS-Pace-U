public class Neutral implements Speaker {

    private String msg = "I think I'm craving a sandwich.";

    public void speak() {

        System.out.println(msg);


    }

    public void announce(String str) {

        str = str.trim();

        System.out.println(Character.toString(str.charAt(0)).toUpperCase() + str.substring(1)  + " is okay with me.");

    }

}