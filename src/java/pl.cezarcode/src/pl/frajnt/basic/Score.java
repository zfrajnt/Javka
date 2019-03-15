package pl.frajnt.basic;

public class Score {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You've got high score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        //OR - lub, albo, to albo to

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of this tests is true");

        int NewValue = 50;
        if(NewValue == 50)
            System.out.println("New Value is 50");

        boolean isCar = false;
        if(isCar == true);
        System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true ");

        // 1. Create a double variable with value 20
        // 2. Create second var of type double with value 80
        // 3. Add both number up and multiply by 25
        // 4. Use the reminder operator to figure out the reminder from the sum of #3 divided by 40
        // 5. Write an "if" statement that display a message "Total was over the limit"
        //    if the remaining total(#4) is equal to 20 or less.

        double firstDouble = 20d;
        double secondDouble = 80;
        double totalDouble = firstDouble + secondDouble * 25;
        System.out.println("My total is " + totalDouble);

        double theReminder = totalDouble % 40;
        System.out.println("Reminder is " + theReminder);

        if (theReminder <= 20)
            System.out.println("Total was over the limit");




    }
}
