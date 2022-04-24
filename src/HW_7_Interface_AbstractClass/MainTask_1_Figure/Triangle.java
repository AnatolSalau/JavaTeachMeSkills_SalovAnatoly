package HW_7_Interface_AbstractClass.MainTask_1_Figure;

public class Triangle extends Figure {

    public Triangle() {
        super("Triangle",3);
    }

    @Override
    public double square() {
        double sP = perimeter()/2;
        return Math.sqrt(sP*(sP - sidesLength[0])*(sP - sidesLength[1])*(sP - sidesLength[2]));
    }

}
