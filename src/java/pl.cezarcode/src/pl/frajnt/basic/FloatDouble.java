package pl.frajnt.basic;

public class FloatDouble {
    public static void main(String[] args) {
        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = (double) 5d / 2;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("MyFloutValue = " + myFloatValue);
        System.out.println("MyDoubleNumber = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create variable to store number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out results
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        //90.718474


    }
}
