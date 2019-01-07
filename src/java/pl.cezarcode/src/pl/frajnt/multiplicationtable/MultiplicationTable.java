package pl.frajnt.multiplicationtable;

public class MultiplicationTable {

    public static void main(String[] args) {
        printMultiplicationTable(12);
        System.out.println();
        printMultiplicationTable(4);
        System.out.println();
        printMultiplicationTable(2);
    }

    public static void printMultiplicationTable(int size) {
        System.out.print("      ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d  ", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
