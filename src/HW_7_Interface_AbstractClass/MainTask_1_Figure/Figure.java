package HW_7_Interface_AbstractClass.MainTask_1_Figure;

import HW_4_Arrays.Sorting;

public abstract class Figure {
    protected double[] sidesLength;
    protected String name;

    public Figure(String name,int lengthQuantity) {
        this.name = name;
        this.sidesLength = new double[lengthQuantity];
    }

    public double perimeter() {
        double result=0;
        for (double val: this.sidesLength) {
            result += val;
        }
        return result;
    }

    public abstract double square ();


    public String getName() {
        return name;
    }

    public void setSidesLength(double... sidesLength) {
        this.sidesLength = sidesLength;
    }

}
