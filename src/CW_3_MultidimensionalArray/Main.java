package CW_3_MultidimensionalArray;

public class Main {
    public static void main(String[] args) {

        getArray();
        printArray(getArray());
    }

    public static int[][][][][][][][] getArray() {
        int[][][][][][][][] myArray = new int[8][8][8][8][8][8][8][8];
        return myArray;
    }
    public static void printArray(int[][][][][][][][] myArray) {
        for (int[][][][][][][] arr: myArray) {
            System.out.println(arr.toString());
        }
    }
}

