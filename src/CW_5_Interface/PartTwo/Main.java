package CW_5_Interface.PartTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Converter converter;

        System.out.print("Enter temperature: ");
        String flag = scanner.nextLine();

        switch(flag) {
            case "c":{
                converter = new CelsiusConverter();
                break;
            }
            case "k":{
                converter = new KelvinConverter();
                break;
            }
            default: {
            converter = new CelsiusConverter();
            }
        }
        converter.convertTo(25);

    }
}
