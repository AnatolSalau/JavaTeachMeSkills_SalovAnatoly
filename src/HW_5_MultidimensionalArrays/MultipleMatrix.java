package HW_5_MultidimensionalArrays;

public class MultipleMatrix {
    public boolean equalSizeOrNotMatrix(int[][] arrayOne, int[][] arrayTwo) {
        //Check equal size matrix or not
        boolean isEqual = true;
        int lengthFirst = arrayOne.length;
        int lengthSecond = arrayTwo.length;
        if (lengthFirst != lengthSecond) {
            isEqual = false;
            return isEqual;
        }
        //check size each array
        for (int i = 0; i < arrayOne.length ; i++) {
            int lengthCurrentOne = arrayOne[i].length;
            int lengthCurrentTwo = arrayTwo[i].length;
            if (lengthCurrentOne != lengthCurrentTwo) {
                isEqual = false;
                return isEqual;
            }
        }
        return isEqual;
    }

    public int[][] multipleTwoMatrix3x3 (int[][] arrayOne, int[][] arrayTwo) {
        int[][] result;
        if (equalSizeOrNotMatrix(arrayOne,arrayTwo) == false) {
            return result = null;
        }
        else if (arrayOne.length != 3) {
            return result = null;
        }
        else {
             result = new int[arrayOne.length][arrayTwo.length];
        }
        // Multiplying matrix first and second
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                int sum = 0;
                for (int k = 0; k < 3; ++k) {
                    sum += arrayOne[i][k] * arrayTwo[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}
