package HW_5_MultidimensionalArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task_1_thirdDimensionalArrayRandomValuesPlusValue();
//        task_2_chessDesk();
        task_3_multipleTwoMatrix();
    }
    public static void task_1_thirdDimensionalArrayRandomValuesPlusValue() {
/*        1. Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый
        элемент на заданное число. Пусть число, на которое будет
        увеличиваться каждый элемент, задается из консоли.*/
        PrintArray printArray = new PrintArray();
        CreateMultidimensionArrays createMultidimensionArrays = new CreateMultidimensionArrays();
        ChangeMultiDImensionArray changeMultiDImensionArray = new ChangeMultiDImensionArray();
        int[][][] array = createMultidimensionArrays.getThirdDimensionalArrayRandomValues(2,2,2,100,0);
        printArray.PrintMultiDimensionArray(array);
        changeMultiDImensionArray.thirdDimensionArrayAddValueFromScanner(array);
        printArray.PrintMultiDimensionArray(array);
    }

    public static void task_2_chessDesk() {
/*        2. Шахматная доска
        Создать программу для раскраски шахматной доски с помощью цикла.
        Создать двумерный массив String'ов 8х8. С помощью циклов задать
        элементам циклам значения B(Black) или W(White). Результат работы
        программы:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W*/
        PrintArray printArray = new PrintArray();
        CreateMultidimensionArrays createMultidimensionArrays = new CreateMultidimensionArrays();
        String[][] array = createMultidimensionArrays.getTwoDimensionArray_String(8,8);
        printArray.PrintMultiDimensionArray(array);

        String[] whiteBlack = {"W", "B"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {array[i][j] = "W";}
                else {array[i][j] = "B";}
            }
        }

        printArray.PrintMultiDimensionArrayWithCycle(array);
    }

    public static void task_3_multipleTwoMatrix () {
/*        4. Умножение двух матриц
        Создайте два массива целых чисел размером 3х3 (две матрицы).
        Напишите программу для умножения двух матриц.
        Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
        Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
        Ожидаемый результат: 1 2 3 1 1 1 0 0 0*/
        PrintArray printArray = new PrintArray();
        CreateMultidimensionArrays createMultidimensionArrays = new CreateMultidimensionArrays();
        int[][] arrayOne = createMultidimensionArrays.getTwoDimensionArrayRandom_int(3,3,100,1);
        int[][] arrayTwo = createMultidimensionArrays.getTwoDimensionArrayRandom_int(3,3,100,1);
        int[] result = new int[9];
        printArray.PrintMultiDimensionArrayWithCycle(arrayOne);
        printArray.PrintMultiDimensionArrayWithCycle(arrayTwo);

    }
}
