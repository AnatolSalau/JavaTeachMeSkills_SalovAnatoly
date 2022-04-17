package HW_4_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        task_0_findNumberInArray();
//        task_1_getNewArrayWithoutValue();
//        task_2_maxMinMiddleValuesFromArray();
//        task_3_twoArrays();
//        task_4_evenNumbersArray();
//        task_5_replaceAllOddElementsZero();
//        task_6_stringArraySort();
//        task_7_bubbleSort();
    }

    public static void task_0_findNumberInArray() {
/*        0. Создайте массив целых чисел. Напишете программу, которая выводит
        сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).*/
        CreateArrays createArrays = new CreateArrays();
        FindInArray findInArray = new FindInArray();
        PrintArray printArray = new PrintArray();
        int[] array = createArrays.arrayInt(10, 0);
        printArray.printArray(array);
        findInArray.scannerPrimitiveInArrayOrNot(array);
    }

    public static void task_1_getNewArrayWithoutValue() {
/*        1. Создайте массив целых чисел. Удалите все вхождения заданного
        числа из массива.
        Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        выведите сообщения об этом.
        В результате должен быть новый массив без указанного числа.*/
        FindInArray findInArray = new FindInArray();
        PrintArray printArray = new PrintArray();
        int[] array = {0, 2, 3, 2, 5, 10, 2, 5, 5, 11, 1, 11};
        printArray.printArray(array);
        printArray.printArray(findInArray.getNewArrayWithoutValue(array));
    }

    public static void task_2_maxMinMiddleValuesFromArray() {
/*          2. Создайте и заполните массив случайным числами и выведете
        максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random().
        Пусть будет возможность создавать массив произвольного размера.
        Пусть размер массива вводится с консоли.*/
        CreateArrays createArrays = new CreateArrays();
        PrintArray printArray = new PrintArray();
        FindInArray findInArray = new FindInArray();
        int[] array = createArrays.getArrayWithRandomIntegerValuesScannerLength();
        printArray.printArray(array);
        findInArray.getMaxMinMiddleValuesFromArrayWithPrint(array);
    }

    public static void task_3_twoArrays() {
/*        3. Создайте 2 массива из 5 чисел.
                Выведите массивы на консоль в двух отдельных строках.
                Посчитайте среднее арифметическое элементов каждого массива и
        сообщите, для какого из массивов это значение оказалось больше (либо
                сообщите, что их средние арифметические равны).*/
        CreateArrays createArrays = new CreateArrays();
        PrintArray printArray = new PrintArray();
        FindInArray findInArray = new FindInArray();
        int[] arrayOne = createArrays.getArrayWithRandomIntegerValues(5);
        int[] arrayTwo = createArrays.getArrayWithRandomIntegerValues(5);
        printArray.printArray(arrayOne);
        printArray.printArray(arrayTwo);
        if (findInArray.getMaxMinMiddleValuesFromArray(arrayOne)[2] > findInArray.getMaxMinMiddleValuesFromArray(arrayTwo)[2]) {
            System.out.printf("Middle value %d in arrayOne bigger than in arrayTwo", findInArray.getMaxMinMiddleValuesFromArray(arrayOne)[2]);
        } else {
            System.out.printf("Middle value %d in arrayTwo bigger than in arrayOne", findInArray.getMaxMinMiddleValuesFromArray(arrayTwo)[2]);
        }
    }

    public static void task_4_evenNumbersArray() {
/*        4. Создайте массив из n случайных целых чисел и выведите его на экран.
        Размер массива пусть задается с консоли и размер массива может быть
        больше 5 и меньше или равно 10.
        Если n не удовлетворяет условию - выведите сообщение об этом.
        Если пользователь ввёл не подходящее число, то программа должна
        просить пользователя повторить ввод.
        Создайте второй массив только из чётных элементов первого массива,
        если они там есть, и вывести его на экран.*/
        CreateArrays createArrays = new CreateArrays();
        PrintArray printArray = new PrintArray();
        FindInArray findInArray = new FindInArray();
        int[] array = createArrays.getArrayWithRandomIntegerValuesFrom5To10();
        printArray.printArray(array);
        int[] evenValues = findInArray.getAllEvenElementsFromArray(array);
        printArray.printArray(evenValues);

    }

    public static void task_5_replaceAllOddElementsZero() {
/*        5. Создайте массив и заполните массив.
        Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль.
        Снова выведете массив на экран на отдельной строке.*/
        CreateArrays createArrays = new CreateArrays();
        FindInArray findInArray = new FindInArray();
        PrintArray printArray = new PrintArray();
        int array[] = createArrays.arrayInt(10, 0);
        printArray.printArray(array);
        findInArray.replaceAllOddElementToZero(array);
        printArray.printArray(array);
    }

    public static void task_6_stringArraySort() {
/*        6. Создайте массив строк. Заполните его произвольными именами
        людей. Отсортируйте массив. Результат выведите на консоль.*/
        String[] array = {"Grigory", "Ivan", "Boris", "Anatoly", "Cesar"};
        PrintArray printArray = new PrintArray();
        System.out.println("Not sorted: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Reverse sort: " + Arrays.toString(array));
    }

    public static void task_7_bubbleSort() {
        /*        7. Реализуйте алгоритм сортировки пузырьком.*/
        CreateArrays createArrays = new CreateArrays();
        PrintArray printArray = new PrintArray();
        Sorting sorting = new Sorting();
        int[] array = createArrays.arrayInt(10, 10, false);
        printArray.printArray(array);
        sorting.bubbleSortArray(array);
        printArray.printArray(array);
    }

}
