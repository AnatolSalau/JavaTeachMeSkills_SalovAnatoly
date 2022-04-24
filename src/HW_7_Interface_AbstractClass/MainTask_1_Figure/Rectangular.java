package HW_7_Interface_AbstractClass.MainTask_1_Figure;

public class Rectangular extends   Figure{

    public Rectangular() {
        super("Rectangular", 4);
    }

    @Override
    public double square() {
        return sidesLength[0]*sidesLength[1];
    }
}
