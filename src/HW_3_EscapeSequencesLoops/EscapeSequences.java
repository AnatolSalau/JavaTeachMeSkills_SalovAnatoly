package HW_3_EscapeSequencesLoops;

import java.util.Scanner;

public class EscapeSequences {
    public static void main(String[] args) {
        coupleOfYearsSwitch();
        coupleOfYearsIfElse();
//        evenOrOdd();
//        temperature();
//        colorOfRainbow();
    }

    public static void coupleOfYearsSwitch() {
/*
                1. Написать программу для вывода названия поры года по номеру
        месяца.
        При решении используйте оператор switch-case.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int numberOfMonth = scanner.nextInt();
        //scanner.close();
        switch (numberOfMonth) {
            case (1) :
                System.out.println("Month is " + "January");
                break;
            case (2) : System.out.println("Month is " + "February");
                break;
            case (3) : System.out.println("Month is " + "March");
                break;
            case (4) : System.out.println("Month is " + "April");
                break;
            case (5) : System.out.println("Month is " + "May");
                break;
            case (6) : System.out.println("Month is " + "June");
                break;
            case (7) : System.out.println("Month is " + "July");
                break;
            case (8) : System.out.println("Month is " + "August");
                break;
            case (9) : System.out.println("Month is " + "September");
                break;
            case (10) : System.out.println("Month is " + "October");
                break;
            case (11) : System.out.println("Month is " + "November");
                break;
            case (12) : System.out.println("Month is " + "December");
                break;
            default:
                System.out.println("Wrong number");
        }


    }
    public static void coupleOfYearsIfElse() {
/*        2. Написать программу для вывода названия поры года по номеру
        месяца.
                При решении используйте оператор if-else-if.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int numberOfMonth = scanner.nextInt();
        scanner.close();
        if (numberOfMonth == 1) {System.out.println("Month is " + "January");}
        else if (numberOfMonth == 2) {System.out.println("Month is " + "February");}
        else if (numberOfMonth == 3) {System.out.println("Month is " + "March");}
        else if (numberOfMonth == 4) {System.out.println("Month is " + "April");}
        else if (numberOfMonth == 5) {System.out.println("Month is " + "May");}
        else if (numberOfMonth == 6) {System.out.println("Month is " + "June");}
        else if (numberOfMonth == 7) {System.out.println("Month is " + "July");}
        else if (numberOfMonth == 8) {System.out.println("Month is " + "August");}
        else if (numberOfMonth == 9) {System.out.println("Month is " + "September");}
        else if (numberOfMonth == 10) {System.out.println("Month is " + "October");}
        else if (numberOfMonth == 11) {System.out.println("Month is " + "November");}
        else if (numberOfMonth == 12) {System.out.println("Month is " + "December");}
        else {System.out.println("Number is wrong");}
    }
    public static void evenOrOdd() {
/*        3. Напишите программу, которая будет принимать на вход число и на
        выход будет выводить сообщение четное число или нет.
        Для определения четности числа используйте операцию получения
        остатка от деления - операция выглядит так: '% 2').*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {System.out.printf("%d is even number", number);}
        else {System.out.printf("%d is odd number", number);}
    }
    public static void temperature() {
/*        4. Для введенного числа t (температура на улице) вывести
        Если t>–5, то вывести «Тепло».
        Если –5>= t > –20, то вывести «Нормально».
        Если –20>= t, то вывести «Холодно».*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temperature = scanner.nextInt();
        scanner.close();
        if (temperature >-5) {System.out.println("Worm");}
        else if ( (-5 >= temperature) && (temperature > -20) ) {System.out.println("Normal");}
        else if (-20 >= temperature) {System.out.println("Cold");}
        else {System.out.println("Incorrect temperature");}
    }
    public static void colorOfRainbow() {
/*        5. По введенному номеру определить цвет радуги (1 –
        красный, 4 – зеленый и т. д.).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color number: ");
        int number = scanner.nextInt();
        scanner.close();
        switch (number) {
            case 1: System.out.println("1 - red");
                break;
            case 2: System.out.println("2 - orange");
                break;
            case 3: System.out.println("3 - yellow");
                break;
            case 4: System.out.println("4 - green");
                break;
            case 5: System.out.println("5 - blue");
                break;
            case 6: System.out.println("6 - purple");
                break;
            case 7: System.out.println("7 - violent");
                break;
            default: System.out.println("Wrong temperature");

        }
    }

}
