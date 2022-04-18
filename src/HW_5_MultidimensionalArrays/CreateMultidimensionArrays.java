package HW_5_MultidimensionalArrays;

import java.lang.Math;

public class CreateMultidimensionArrays {

    public int[][][] getThirdDimensionalArrayRandomValues(int a, int b, int c, int max, int min) {
        int[][][] array = new int[a][b][c];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                for (int k = 0; k <array[i][j].length ; k++) {
                    array[i][j][k] =(int) (Math.random() * ((max - min) + 1)) + min;
                }
            }
        }
        return array;
    }

    public String[][] getTwoDimensionArray_String(int width, int height) {
        String[][] array = new String[height][width];
        return  array;
    }

    public int[][] getTwoDimensionArray_int(int width, int height) {
        int[][] array = new int[height][width];
        return  array;
    }

    public int[][] getTwoDimensionArrayRandom_int(int width, int height, int max, int min) {
        int[][] array = new int[height][width];
        for (int i = 0; i <array.length ; i++) {
                for (int k = 0; k <array[i].length ; k++) {
                    array[i][k] =(int) (Math.random() * ((max - min) + 1)) + min;
                }
        }
        return  array;
    }
}
