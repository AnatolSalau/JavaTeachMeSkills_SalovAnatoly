package CW_8_OOP;

class Main {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[4];

        printableArray[0] = new Book();
        printableArray[1] = new Magazine();
        printableArray[2] = new Book();
        printableArray[3] = new Magazine();

        for (Printable print: printableArray) {
            print.print();
        }
        System.out.println("---------------------");
        Magazine.printMagazines(printableArray);
        System.out.println("---------------------");
        Book.printMagazines(printableArray);

    }
}
