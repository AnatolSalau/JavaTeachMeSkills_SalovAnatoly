package CW_9_Static;

import java.util.Arrays;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(int size) {
        this.flowers = new Flower[size];
    }

    public void printString() {
        System.out.println(Arrays.toString(flowers));
    }
    public Flower[] getFlowers() {
        return flowers;
    }

    public static void printCos() {

    }
}
