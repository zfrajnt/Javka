package pl.frajnt.christmas;

public class ChristmasTree {

    public static void main(String[] args) {
        printChristmasTree(15);
    }

    public static void printChristmasTree(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("**");
    }
}