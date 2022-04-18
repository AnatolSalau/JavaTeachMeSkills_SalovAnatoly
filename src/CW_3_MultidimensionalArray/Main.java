package CW_3_MultidimensionalArray;

import java.util.Arrays;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
//        task_1_multipleArrayReplaceAllOddElements();
        task_2_multipleArrayPrintMaxAbs();

    }
    public static void task_1_multipleArrayReplaceAllOddElements () {
/*        Задание 1
        1. Создайте и заполните массив 8 на 8
        2. Выведите массив на экран
        3. Замените каждый элемент массива с нечетным индексом (стобца или строки) на 8
        4. Выведите результат на экран*/
        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j;
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = 8;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
    public static void task_2_multipleArrayPrintMaxAbs () {
/*        Задание 2
        1. Создать массив (двухмерный)
        2. Выведите его на экран
        3. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов*/
        int[][] array = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * ((100 - 1) + 1)) + 1;
            }
        }
        System.out.println(Arrays.deepToString(array));

        int multipleResult = 1;
        int index = 0 ;

        for (int i = 0; i < array.length; i++) {
            int multipleCurrent = 1;
            for (int j = 0; j < array[i].length; j++) {
                multipleCurrent *=array[i][j];
            }
            System.out.printf("multople arr [%d] = %d\n",i, multipleCurrent);
            if (multipleCurrent > multipleResult) {
                multipleResult = multipleCurrent;
                index = i;
            }
        }

        System.out.printf("index %d\n", index);
        System.out.printf("multipleResult %d\n", multipleResult);
    }
}


