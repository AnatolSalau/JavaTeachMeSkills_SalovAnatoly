package CW_4_ClassConstructor;

import java.lang.Math;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double lengthVector () {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarMultiple (Vector vector) {
        return (this.x*vector.x) + (this.y*vector.y) + (this.y*vector.z);
    }

    public  double[] multipleAnotherVector (Vector vector) {
        double[] result = new double[3];
        result[0] = this.y * vector.z - this.z*vector.y;
        result[1] = this.z * vector.x - this.x*vector.z;
        result[2] = this.x * vector.y - this.y*vector.x;
        return result;
    }

    public double angleBetweenVectors (Vector vector){
        double result = ( scalarMultiple(vector) / Math.abs(this.lengthVector()) * Math.abs(vector.lengthVector()) ) ;
        return result;
    }

    public double[] summVectors (Vector vector) {
        double[] result = new double[3];
        result[0] = this.x + vector.x ;
        result[1] = this.y + vector.y ;
        result[2] = this.z + vector.z ;
        return result;
    }

    public double[] differenceVectors (Vector vector) {
        double[] result = new double[3];
        result[0] = this.x - vector.x ;
        result[1] = this.y - vector.y ;
        result[2] = this.z - vector.z ;
        return result;
    }

    public static Vector[] arrayVectors (int value) {
        Vector[] result = new Vector[value];
        return result;
    }

}
