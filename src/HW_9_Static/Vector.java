package HW_9_Static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Vector {

    private final SizeVector description;
    private double[] coordinates;

    public Vector (double coordinateX, double coordinateY) {
        description = SizeVector.TWO_SIZE_VECTOR;
        coordinates = new double[SizeVector.TWO_SIZE_VECTOR.getLengthArray()];
        coordinates[0] = coordinateX;
        coordinates[1] = coordinateY;
    }

    public Vector(double coordinateX, double coordinateY, double coordinateZ) {
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
        System.out.printf("getVectorLength = %f\n",
                getVectorLength());
    }

    public static double getScalarMultiply(
            Vector vectorOne, Vector vectorTwo, double angleBetwee) {
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
    public static void printScalarMultiply(
            Vector vectorOne, Vector vectorTwo, double angleBetwee) {
    double result = getScalarMultiply(
            vectorOne, vectorTwo, angleBetwee);
        System.out.printf("getScalarMultiply = %f\n",result);
    }

    public static double[] getScalarDifference(Vector vectorOne, Vector vectorTwo) {
        if (vectorOne.getDescription() != vectorTwo.getDescription()) {
            return null;
        }
//        для вектора размерностью 2 возвращаем массив длинной 2
//        для вектора размерностью 3 возвращаем массив длинной 3
        double[] result;
        if(vectorOne.getDescription() == SizeVector.TWO_SIZE_VECTOR) {
            result = new double[2];
            for (int i = 0; i < vectorOne.getCoordinates().length; i++) {
                result[i] = Math.abs(vectorOne.getCoordinates()[i]) - Math.abs(vectorTwo.getCoordinates()[i]);
            }
            return result;
        }
        else if (vectorOne.getDescription() == SizeVector.THREE_SIZE_VECTOR) {
            result = new double[3];
            for (int i = 0; i < vectorOne.getCoordinates().length; i++) {
                result[i] = vectorOne.getCoordinates()[i] - vectorTwo.getCoordinates()[i];
            }
            return result;
        }
        else {
            return null;
        }
    }
    public static void printScalarDifference(Vector vectorOne, Vector vectorTwo) {
        System.out.println(Arrays.toString(getScalarDifference(vectorOne,vectorTwo)));
    }

    public static Vector[] getArrayVectors(int N, SizeVector sizeVector) {
        Vector[] result = new Vector[N];
        if (sizeVector == SizeVector.TWO_SIZE_VECTOR) {
            for (int i = 0; i < result.length; i++) {
                result[i] = new Vector(getRandomDouble(), getRandomDouble());
            }
        }
        else {
            for (int i = 0; i < result.length; i++) {
            result[i] = new Vector(getRandomDouble(), getRandomDouble(),getRandomDouble());
            }
        }
        return result;
    }
    public static void printArrayVectors(int N, SizeVector sizeVector) {
        Vector[] result = getArrayVectors(N,sizeVector);
        for (Vector vector:result) {
            for (double val : vector.getCoordinates()) {
                System.out.printf("%f ",val);
            }
                System.out.printf("\n");
        }
    }

    private static double getRandomDouble() {
//      Math.random() * (max - min) + min
        return Math.random() * (10 - 1) + 10;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "description=" + description +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }

    public void printToString() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return description == vector.description && Arrays.equals(
                coordinates, vector.coordinates);
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

    public double[] getCoordinates() {
        return coordinates;
    }
}
