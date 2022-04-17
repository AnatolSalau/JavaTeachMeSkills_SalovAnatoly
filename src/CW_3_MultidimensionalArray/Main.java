package CW_3_MultidimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        consolePrintMultiDimensionArray(getMultiDimensionArray(4,4));

    }

    public static int[][] getMultiDimensionArray(int width, int height) {
        int[][] array = new int[width][height];
        return array;
    }

    public static void consolePrintMultiDimensionArray(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void findAndPrintIndexStringWithMaxMultiple (int[][] array) {
        int maxMultiple = 0;
        //int indexOfMaxMultipleString
        for (int[] arr : array) {
            int resultMultiple = 1;
            for (int val:arr) {
                resultMultiple *= val;
            }
            if (maxMultiple > resultMultiple) {
                maxMultiple = resultMultiple ;
            }};
        System.out.println();
    }
}

