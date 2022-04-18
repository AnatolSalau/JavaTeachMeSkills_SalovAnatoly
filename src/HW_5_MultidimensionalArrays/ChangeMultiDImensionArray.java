package HW_5_MultidimensionalArrays;

import java.util.Scanner;

public class ChangeMultiDImensionArray {
    public void thirdDimensionArrayAddValueFromScanner  (int[][][] array) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter number that will add: ");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        else {
            System.out.println("Wrong type of length: ");
        }
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                for (int k = 0; k <array[i][j].length ; k++) {
                    array[i][j][k] += number;
                }
            }
        }
        scanner.close();
    }
}
