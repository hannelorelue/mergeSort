package luebeck.hannelore;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] actual = { 5, 1, 6, 2, 3, 4 ,4, -3};
        System.out.println("Input: ");
        System.out.println(Arrays.toString(actual));
        MergeSort.mergeSort(actual, actual.length);

        System.out.println("Output: ");
        System.out.println(Arrays.toString(actual));
    }
}