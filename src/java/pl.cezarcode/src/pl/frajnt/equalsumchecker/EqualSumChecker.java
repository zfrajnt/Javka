package pl.frajnt.equalsumchecker;

public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int firstN , int secondN, int thirdN){
        if (firstN + secondN == thirdN){
            return true;
        }
        else {
            return false;
        }
    }
}
