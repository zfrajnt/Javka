package pl.frajnt.basic;

public class IfKeywords {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        // If else with AND &&

        if (score < 5000 && score > 1000) {
            System.out.println("You score was less than 5000, but greater than 1000");
        }else if(score < 1000){
            System.out.println("You score was less than 1000");
        }else{
            System.out.println("Got here");
        }
        System.out.println("");

        // If with boolean - sum finally score

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " +finalScore);

        }



    }


}
