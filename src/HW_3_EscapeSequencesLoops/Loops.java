package HW_3_EscapeSequencesLoops;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Loops {
    public static void main(String[] args) {
//        oddNumbers1to99();
//        numbersFrom5to1();
//        summOddNumbers();
//        subsequence();
//        firstTenNumbers();
//        squares();
    }

    public static void oddNumbers1to99 () {
/*        1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        При решении используйте операцию инкремента (++).*/
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 1) {System.out.printf("%d ",i );}
        }
        System.out.printf("\n");
    }
    public static void numbersFrom5to1 () {
/*        2. Необходимо вывести на экран числа от 5 до 1.
        При решении используйте операцию декремента (--).*/
        for (int i = 5; i >= 0; i--) {
            System.out.printf("%d ",i );
        }
        System.out.printf("\n");
    }
    public static void summOddNumbers () {
/*        3. Напишите программу, где пользователь вводит любое целое
        положительное число. А программа суммирует все числа от 1 до
        введенного пользователем числа.
                Для ввода числа воспользуйтесь классом Scanner.*/
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result =0;
        for (int i = 1; i <= number; i++) {
            if (number <= 0){
                System.out.println("Enter only positive number");
                    break;
            };
            result +=i;
        }
        System.out.println(result);
    }
    public static void subsequence () {
/*        4. Необходимо, чтоб программа выводила на экран вот такую
        последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        В решении используйте цикл while.*/
        int counter = 1;
        int end = 100;
        int delimetr = 7;
        while ( counter < end) {
            if (counter % delimetr == 0) {System.out.printf("%d ", counter);}
            counter +=1;
        }
    }
    public static void firstTenNumbers () {
/*        5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..*/
        int start =0;
        int count = 5;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", start);
            start -= count;
        }
    }
    public static void squares () {
/*        6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20
        включительно.*/
        int start =10;
        int end = 20;
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i*i);
        }
    }

}


