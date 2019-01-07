package pl.frajnt.pascaltriangle;

public class PascalTriangle {
    public static void main(String[] args) {
        printPascalTriangle(12);
    }

    public static void printPascalTriangle(int maxRows) {
        for (int i = 0; i <= maxRows; i++) {
            for (int j = (maxRows - i) * 3; j > 0; j--) {
                System.out.print(" ");
            }
            int currentNumber = 1;
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    currentNumber = currentNumber * (i + 1 - col) / col;
                }
                System.out.printf("%6d", currentNumber);
            }
            System.out.println();
        }
    }
}
