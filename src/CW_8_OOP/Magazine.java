package CW_8_OOP;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("There is magazine.");
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable print : printable) {
            if (print instanceof Magazine) {
                print.print();
            }
        }
    }

}
