package CW_2_Arrays;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        /*
         * написать метод поиск максимального значения
         * написать метод поиск минимального значения
         * */
        CreateArrays createArrays = new CreateArrays();
        int[] array = createArrays.arrayInt(1000,25);
        System.out.printf("Max value = %d\n", maxValue(array));
        System.out.printf("Min value = %d\n", minValue(array));
    }
    public static int minValue(int[] array) {
        int result =array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }
    public static int maxValue(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;

    }
}
