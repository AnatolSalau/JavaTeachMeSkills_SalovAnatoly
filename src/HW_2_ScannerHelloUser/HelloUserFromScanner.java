package HW_2_ScannerHelloUser;

import java.util.Scanner;
public class HelloUserFromScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello, please enter your name: ");
        String nameUser = scanner.next();
        System.out.printf("Your user name: %s", nameUser);
    }
}
