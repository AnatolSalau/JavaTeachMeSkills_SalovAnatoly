package HW_4_Arrays;

import java.util.Scanner;
import java.lang.Math;
public class CreateArrays {

    public int[] arrayInt(int length, int startValue, boolean increasingOrNot) {
        int[] array = new int[length];
        if (increasingOrNot == true) {
            for (int value =0; value < array.length; value++) {
                array[value] = startValue;
                startValue += 1;
            }
        } else {
            for (int value =0; value < array.length; value++) {
                array[value] = startValue;
                startValue -= 1;
            }
        }
        return array;
    }

    public int[] arrayInt(int length, int startValue) {
        int[] array = new int[length];
        for (int value =0; value < array.length; value++) {
            array[value] = startValue;
            startValue += 1;
        }
        return array;
    }

    public int[] getArrayWithRandomIntegerValuesScannerLength () {
        Scanner scanner = new Scanner(System.in);
        int[] result;
        System.out.println("Enter length of array: ");
        if (scanner.hasNextInt()) {
            int length = scanner.nextInt();
            result = new int[length];
            for (int i = 0; i < result.length; i++) {
                result[i] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
            }
        }
        else {
            result = null;
            System.out.println("Wrong type of length: ");
        }
        scanner.close();
        return result;
    }

    public int[] getArrayWithRandomIntegerValues (int length) {
        int[] result;
        result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
        }
        return result;
    }

    public int[] getArrayWithRandomIntegerValuesFrom5To10 () {
        Scanner scanner = new Scanner(System.in);
        int[] result = null;
        System.out.println("Enter length of array from 5 to 10 inclusive: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int length = scanner.nextInt();
                    while (length < 5 || length >=10) {
                        System.out.println("Length not in the correct range ");
                        length = scanner.nextInt();
                    }
                    result = new int[length];
                    for (int i = 0; i < result.length; i++) {
                        result[i] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
                    }
                    break;
            } else {
                System.out.println("Wrong type of length, enter new number!: ");
                scanner.nextLine(); // to clear Scanner
            }
        }
        scanner.close();
        return result;
    }


}
