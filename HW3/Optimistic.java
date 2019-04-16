public class Optimistic implements Speaker {

    private String msg = "Shoot for the moon. Even if you miss, you'll land among the stars.";

    public void speak() {

        System.out.println(msg);

    }

    public void announce(String str) {

        str = str.trim();

        System.out.println(Character.toString(str.charAt(0)).toUpperCase() + str.substring(1)  + " is the best!");

    }

}