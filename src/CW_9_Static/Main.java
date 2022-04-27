package CW_9_Static;

public class Main {
    public static void main(String[] args) {
    Bouquet bouquet = new Bouquet(3);
    Gvozdic gvozdicDefault = new Gvozdic();
    Gvozdic gvozdic = new Gvozdic(10,"Gvozdic");
    Rose rose = new Rose(20,"Rose");
    Tulpan tulpan = new Tulpan(30,"Tulpan");

    bouquet.printString();

        System.out.println(gvozdicDefault.toString());
        System.out.println(gvozdic.toString());
        System.out.println(rose.toString());
        System.out.println(tulpan.toString());

        Flower.printCount();


    }
}
