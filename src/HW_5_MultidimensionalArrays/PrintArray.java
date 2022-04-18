package HW_5_MultidimensionalArrays;

import java.util.Arrays;

public class PrintArray {
    public  void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public void PrintMultiDimensionArray(int[][][] array) {
        System.out.println(Arrays.deepToString(array));
    }
    public void PrintMultiDimensionArray(String[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public void PrintMultiDimensionArrayWithCycle(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.printf("\n");
        }
    }
    public void PrintMultiDimensionArrayWithCycle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.printf("\n");
        }
    }
}

