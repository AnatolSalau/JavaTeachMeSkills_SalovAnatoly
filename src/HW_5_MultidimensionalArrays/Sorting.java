package HW_5_MultidimensionalArrays;

public class Sorting {
    public void bubbleSortArray (int[] array) {
        boolean arrayIsSorted = false;
        while (arrayIsSorted != true) {
            int count =0;
            arrayIsSorted = true;
            while (count < array.length-1) {
                if (array[count] > array[count + 1]) {
                    int tmp = array[count];
                    array[count] = array[count+1];
                    array[count+1] = tmp;
                    arrayIsSorted = false;
                }
                count ++;
            }
        }
    }
}
