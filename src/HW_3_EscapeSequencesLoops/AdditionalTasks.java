package HW_3_EscapeSequencesLoops;

import java.util.Scanner;
import java.lang.Math;

public class AdditionalTasks {
    public static void main(String[] args) {
//        fibonacciSequence();
//        bank();
        tableOfMultiple();
    }
    public static void fibonacciSequence() {
/*        1. Выведите на экран первые 11 членов последовательности Фибоначчи.*/
        int first_number = 0,
            second_number = 1,
            third_number,
            number =11;
        System.out.printf("%d ", first_number);
        System.out.printf("%d ", second_number);
        for(int i = 2; i < number; i++) //loop will starts from 2 because we have printed 0 and 1 before
        {
            if (i <= 1)
                third_number = i;
            else
            {
                third_number = first_number + second_number;
                System.out.printf("%d ", third_number);
                first_number = second_number;
                second_number = third_number;
            }
        }
    }

    public static void bank () {
/*        2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        Напишите программу, в которую пользователь вводит сумму вклада и
        количество месяцев. А банк вычисляет конечную сумму вклада с учетом
        начисления процентов за каждый месяц.
        Для вычисления суммы с учетом процентов используйте цикл for. Пусть
        сумма вклада будет представлять тип float.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter sum of deposit: ");
        float deposit = scanner.nextFloat();
        System.out.print("Please enter count of months: ");
        int countMonths = scanner.nextInt();
        scanner.close();
        for (int i=0; i< countMonths; i++) {
            deposit += deposit * 0.07f;
        }
        System.out.printf("Your deposit after %d months is %f ", countMonths, deposit);
    }

    public static void tableOfMultiple () {
/*        3. Напишите программу, которая выводит на консоль таблицу умножения.*/
        System.out.printf("     ");
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d    ",i);
        }
        System.out.printf("\n\n");

        for (int i = 1; i <= 10; i++) {

            if (i >= 10) {System.out.printf("%d   ",i);}
            else {System.out.printf("%d    ",i);}

            for (int j = 1; j <= 10; j++) {
                if (i*j >= 10) {System.out.printf("%d   ",i*j);}
                else {System.out.printf("%d    ",i*j);}

            }
            System.out.printf("\n");
        }
    }
}
