package HW_9_Static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Vector {

    private final SizeVector description;
    private double[] coordinates;

    public Vector (int coordinateX, int coordinateY) {
        description = SizeVector.TWO_SIZE_VECTOR;
        coordinates = new double[SizeVector.TWO_SIZE_VECTOR.getLengthArray()];
        coordinates[0] = coordinateX;
        coordinates[1] = coordinateY;

    }

    public Vector(int coordinateX, int coordinateY, int coordinateZ) {
        description = SizeVector.THREE_SIZE_VECTOR;
        coordinates = new double[SizeVector.THREE_SIZE_VECTOR.getLengthArray()];
        coordinates[0] = coordinateX;
        coordinates[1] = coordinateY;
        coordinates[2] = coordinateZ;
    }

    public double getVectorLength() {
        double result = 0;

        for (double val : coordinates) {
            result += val*val;
        }
        result = Math.abs(result);
        result = Math.sqrt(result);

        return result;
    }
    public void printVectorLength() {
        System.out.printf("getVectorLength = %f\n",getVectorLength());
    }

    public static double getScalarMultiply(Vector vectorOne, Vector vectorTwo, double angleBetwee) {
        if (vectorOne.getDescription() != vectorTwo.getDescription()) {
            return -1;
        }

        double lengthOne = vectorOne.getVectorLength();
        double lengthTwo = vectorTwo.getVectorLength();
        double cos = Math.cos(angleBetwee);
        double result = lengthOne * lengthTwo * cos;
        result = Math.abs(result);
        return  result;
    }
    public static void printScalarMultiply(Vector vectorOne, Vector vectorTwo, double angleBetwee) {
    double result = getScalarMultiply(vectorOne, vectorTwo, angleBetwee);
        System.out.printf("getScalarMultiply = %f\n",result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return description == vector.description && Arrays.equals(coordinates, vector.coordinates);
    }
    public void printEquals (Object o) {
        if (equals(o)) {
            System.out.println("Vector equal qurrent equal\n");
        }
        else {
            System.out.println("Vector not equal\n");
        }
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(coordinates);
        return result;
    }

    public SizeVector getDescription() {
        return description;
    }
}
