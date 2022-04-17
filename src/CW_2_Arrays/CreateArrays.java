package CW_2_Arrays;

public class CreateArrays {
    public int[] arrayInt(int length, int startValue, boolean increasingOrNot) {
        int[] array = new int[length];
        if (increasingOrNot == true) {
            for (int value =0; value < array.length; value++) {
                array[value] = startValue;
                startValue += 1;
            }
        } else {
            for (int value =0; value < array.length; value++) {
                array[value] = startValue;
                startValue += 1;
            }
        }
        return array;
    }

    public int[] arrayInt(int length, int startValue) {
        int[] array = new int[length];
        for (int value =0; value < array.length; value++) {
            array[value] = startValue;
            startValue += 1;
        }
        return array;
    }
}
