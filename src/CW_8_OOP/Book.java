package CW_8_OOP;

class Book implements Printable {
    @Override
    public void print() {
        System.out.println("There is book.");
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable print : printable) {
            if (print instanceof Book) {
                print.print();
            }
        }
    }
}
