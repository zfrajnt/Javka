package pl.frajnt.sort;

import java.util.Arrays;
import java.util.Random;

public class TestOfSorting {
    public static void main(String[] args) {
        Random r = new Random();
        int[] testArray = new int[50];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt(100);
        }
        int[] testArray2 = Arrays.copyOf(testArray, testArray.length); // for object use DEEP COPY

        System.out.println("BUBBLE SORT:");
        TestOfSorting.printArray(testArray);
        // long start = System.currentTimeMillis();
        BubbleSort.sort(testArray);
        // System.out.println(System.currentTimeMillis() - start);
        TestOfSorting.printArray(testArray);
        System.out.println("");
        System.out.println("SORT SELECT:");
        TestOfSorting.printArray(testArray2);
        // long start = System.currentTimeMillis();
        SelectionSort.sort(testArray2);
        // System.out.println(System.currentTimeMillis() - start2);
        TestOfSorting.printArray(testArray2);

    }

    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

}

