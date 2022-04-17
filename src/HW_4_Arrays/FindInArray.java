package HW_4_Arrays;

import java.util.Scanner;

public class FindInArray {
    public boolean scannerPrimitiveInArrayOrNot(int[] array) {
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        System.out.print("Enter one value of primitive type: ");
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    System.out.printf("Value %d is find", value);
                    result = true;
                    break;
                }
            }
            if (result == false){
                System.out.printf("Value %d didn't find", value);
            }

        } else {
            System.out.print("Wrong entered type of value in scanner!");
        }

        scanner.close();

        return result;
    }

    public boolean scannerPrimitiveInArrayOrNot(String[] array) {
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        System.out.print("Enter one value of primitive type: ");
        if (scanner.hasNextLine()) {
            String value = scanner.nextLine();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    System.out.printf("Value %d is find", value);
                    result = true;
                    break;
                }
            }
        } else {
            System.out.print("Wrong entered type of value in scanner!");
        }
        scanner.close();
        return result;
    }

    public int[] getNewArrayWithoutValue(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of primitive type: ");
        int[] result;
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            int[] buffer = new int[array.length];
            int top = 0;
/*              Копируем все нужные значения из пришедшего массива в буфер
                и считаем счетчиком сколько они занимают индексов*/
            for (int i = 0; i < buffer.length; i++) {
                if (array[i] != value) {
                    buffer[top] = array[i];
                    top += 1;
                }
            }
            /*            Создаем массив нужной длинны  и заполняем*/
            result = new int[top];
            for (int i = 0; i < result.length; i++) {
                result[i] = buffer[i];
            }
        } else {
            result = null;
            System.out.print("Wrong entered type of value in scanner!");
        }
        scanner.close();
        return result;
    }

    public int[] getMaxMinMiddleValuesFromArrayWithPrint(int[] array) {
        int[] maxMinMiddle = new int[3];
        maxMinMiddle[0] = array[0];
        maxMinMiddle[1] = array[0];
        for (int i = 0; i < array.length; i++) {
            maxMinMiddle[2] += array[i];
        }
        maxMinMiddle[2] = maxMinMiddle[2] / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxMinMiddle[0]) {
                maxMinMiddle[0] = array[i];
            } else if (array[i] < maxMinMiddle[1]) {
                maxMinMiddle[1] = array[i];
            } else {
                continue;
            }
        }
        System.out.printf("Max value = %d\n", maxMinMiddle[0]);
        System.out.printf("Min value = %d\n", maxMinMiddle[1]);
        System.out.printf("Middle value = %d\n", maxMinMiddle[2]);
        return maxMinMiddle;
    }

    public int[] getMaxMinMiddleValuesFromArray(int[] array) {
        int[] maxMinMiddle = new int[3];
        maxMinMiddle[0] = array[0];
        maxMinMiddle[1] = array[0];
        for (int i = 0; i < array.length; i++) {
            maxMinMiddle[2] += array[i];
        }
        maxMinMiddle[2] = maxMinMiddle[2] / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxMinMiddle[0]) {
                maxMinMiddle[0] = array[i];
            } else if (array[i] < maxMinMiddle[1]) {
                maxMinMiddle[1] = array[i];
            } else {
                continue;
            }
        }
        return maxMinMiddle;
    }
    public int[] getAllEvenElementsFromArray(int[] array) {
        int[] result;
        int[] buffer = new int[array.length];
        int top = 0;
/*              Копируем все нужные значения из пришедшего массива в буфер
                и считаем счетчиком сколько они занимают индексов*/
        for (int i = 0; i < buffer.length; i++) {
            if (array[i] % 2 == 0) {
                buffer[top] = array[i];
                top += 1;
            }
        }
/*            Создаем массив нужной длинны  и заполняем*/
        result = new int[top];
        for (int j = 0; j < result.length; j++) {
            result[j] = buffer[j];
        }
        return result;
    }

    public int[] getAllOddElementsFromArray(int[] array) {
        int[] result;
        int[] buffer = new int[array.length];
        int top = 0;
/*              Копируем все нужные значения из пришедшего массива в буфер
                и считаем счетчиком сколько они занимают индексов*/
        for (int i = 0; i < buffer.length; i++) {
            if (array[i] % 2 != 0) {
                buffer[top] = array[i];
                top += 1;
            }
        }
        /*            Создаем массив нужной длинны  и заполняем*/
        result = new int[top];
        for (int j = 0; j < result.length; j++) {
            result[j] = buffer[j];
        }
        return result;
    }

    public void replaceAllOddElementToZero (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
    }
}
