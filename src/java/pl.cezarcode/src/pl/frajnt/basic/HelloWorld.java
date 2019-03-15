package pl.frajnt.basic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("");

        // VARRIABLES & OPERATORS

        int myFirstNumber = (10 +5) +( 2 *10);
        int mySecondNumber = 12;
        int myThirdNumer = myFirstNumber *2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumer;

        int myLastOnr = 1000 - myTotal;

        System.out.println("Moja liczba to: " +myFirstNumber);

        System.out.println("Moja suma to: " +myTotal);

        System.out.println("1000 - suma: " +myLastOnr);


    }
}
