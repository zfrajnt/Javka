package pl.frajnt.basic;

public class Strings {
    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My string equal " + myString);
        myString = myString + ", and this is more";
        System.out.println("My string equal " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("My string equal " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string equal to " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("Last string value " + lastString);
    }
}
