package CW_2_Arrays;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /*
        * написать метод удаления из массива
        * сдвинуть весь элемент влево на одну ячейку
        * */
        CreateArrays createArrays = new CreateArrays();
        int[] array = createArrays.arrayInt(10,0);
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        deleteElement(array,value);

    }
    public static void deleteElement (int[] array, int element) {
        boolean isDeleted = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
                isDeleted = true;
            }
        }
        if (isDeleted == true) {
            PrintArray printArray = new PrintArray();
            printArray.printArray(array);
        }
        else {
            System.out.println("Nothing Found");
        }
    }
}
