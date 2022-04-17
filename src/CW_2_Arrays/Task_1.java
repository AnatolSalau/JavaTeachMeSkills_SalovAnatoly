package CW_2_Arrays;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /*
     1. создать массив
     2. ввести любое число или текст с клавиатуры
     3. передать в метод поиска элемента число(или текст) и массив
     4. если такой элемент найден - вывести его индекс
     5. если ничего не найдено - вывести, что ничего не найдено
     6. можно делать простым перебором или бинарным поиском
 */
        CreateArrays createArrays = new CreateArrays();
        int[] array = createArrays.arrayInt(10,0);
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        findIndex(array,value);
        scanner.close();
    }
    public static void findIndex (int[] array, int element) {
        int resultIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                resultIndex = i;
            }
        }
        if (resultIndex > -1) {
            System.out.println("Index of value in array:" + resultIndex);
        }
        else {
            System.out.println("Nothing Found");
        }

    }


}
