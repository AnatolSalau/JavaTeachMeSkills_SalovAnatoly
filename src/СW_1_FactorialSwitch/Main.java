package СW_1_FactorialSwitch;

public class Main {


    public static void main(String[] args) {
/*        switch (number) {
            case (0) :
                System.out.printf("You have entered %d\n", number);
                break;
            case (1) :
                System.out.printf("You have entered %d\n", number);
                break;
            case (2) :
            case (3) :
                System.out.printf("You have entered %d\n", number);
                break;
            default:
                System.out.printf("Error");
        }
    */
        int number = 4;
        System.out.println("factorialForLoop = "+ factorialForLoop(number));
        System.out.println("factorialWhileLoop = " + factorialWhileLoop(number));
        System.out.println("factorialDoWhileLoop = " + factorialDoWhileLoop(number));
    }

    public static int factorialForLoop (int number) {
        int result = 1;
        for (int i =1; i<=number; i+=1) {
            result *=i;
        }
        return result;
    }

    public static int factorialWhileLoop (int number) {
        int result = 1;
        int i =1;
        while (i<number ) {
            i+=1;
            result *=i;
        }
        return result;
    }
    public static int factorialDoWhileLoop (int number) {
        int result = 1;
        int i =1;
        do {
            result *=i;
            i+=1;
        } while (i<=number);
        return result;
    }


}
