package HW_7_Interface_AbstractClass.MainTask_1_Figure;

import java.lang.Math;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        super("Square",1);
        this.radius = 0;
        setLengthSideCircle();
    }

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }

    public void setLengthSideCircle() {
        this.sidesLength[0] = 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
        setLengthSideCircle();
    }
}
