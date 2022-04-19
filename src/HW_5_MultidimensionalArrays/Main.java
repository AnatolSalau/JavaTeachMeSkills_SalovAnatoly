package HW_5_MultidimensionalArrays;

public class Main {
    public static void main(String[] args) {
        task_1_thirdDimensionalArrayRandomValuesPlusValue();
//        task_2_chessDesk();
//        task_3_multipleTwoMatrix();
//        task_4_sumAllElement();
//        task_5_diagonal();
//        task_6_sortMatrix();
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
        MultipleMatrix multipleMatrix = new MultipleMatrix();
        int[][] arrayOne = createMultidimensionArrays.getTwoDimensionArrayRandom_int(3,3,2,1);
        int[][] arrayTwo = createMultidimensionArrays.getTwoDimensionArrayRandom_int(3,3,2,1);
        int[][] result;
        printArray.PrintMultiDimensionArrayWithCycle(arrayOne);
        System.out.println();
        printArray.PrintMultiDimensionArrayWithCycle(arrayTwo);
        System.out.println("Matrix equal size or not: " + multipleMatrix.equalSizeOrNotMatrix(arrayOne,arrayTwo));
        result = multipleMatrix.multipleTwoMatrix3x3(arrayOne,arrayTwo);
        printArray.PrintMultiDimensionArrayWithCycle(result);

    }

    public static void task_4_sumAllElement() {
/*        4. Создайте двумерный массив целых чисел. Выведите на консоль сумму
        всех элементов массива.*/
        CreateMultidimensionArrays createMultidimensionArrays = new CreateMultidimensionArrays();
        PrintArray printArray = new PrintArray();
        int[][] array = createMultidimensionArrays.getTwoDimensionArrayRandom_int(3,3,2,1);
        printArray.PrintMultiDimensionArrayWithCycle(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum +=array[i][j];
            }
        }
        System.out.printf("Sum all elements: %d",sum);
    }

    public static void task_5_diagonal () {
/*        5. Создайте двумерный массив. Выведите на консоль диагонали массива.*/
        CreateMultidimensionArrays createMultidimensionArrays = new CreateMultidimensionArrays();
        PrintArray printArray = new PrintArray();
        int[][] array = createMultidimensionArrays.getTwoDimensionArrayRandom_int(5,5,5,1);
        printArray.PrintMultiDimensionArrayWithCycle(array);
        System.out.printf("\n");
        //first diagonal
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i][i]);
        }
        System.out.println();
        //second diagonal
        int j = array.length-1;
        for (int i = array.length-1; i >=0; i--) {
            System.out.printf("%d ", array[j][array.length-1-i]);
            j--;
        }
    }

    public static void task_6_sortMatrix () {
/*        6. Создайте двумерный массив целых чисел. Отсортируйте элементы в
        строках двумерного массива по возрастанию.*/
        CreateMultidimensionArrays createMultidimensionArrays = new CreateMultidimensionArrays();
        PrintArray printArray = new PrintArray();
        Sorting sorting = new Sorting();
        int[][] array = createMultidimensionArrays.getTwoDimensionArrayRandom_int(5,5,10,1);
        printArray.PrintMultiDimensionArrayWithCycle(array);
        for (int i = 0; i < array.length; i++) {
            sorting.bubbleSortArray(array[i]);
        }
        System.out.println();
        printArray.PrintMultiDimensionArrayWithCycle(array);
    }
}
