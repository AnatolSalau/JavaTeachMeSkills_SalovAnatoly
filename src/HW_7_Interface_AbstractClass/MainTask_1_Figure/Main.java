package HW_7_Interface_AbstractClass.MainTask_1_Figure;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/*        1. Написать иерархию классов «Фигуры».
        Фигура -> Треугольник -> Прямоугольник -> Круг.
        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
        периметра.
        Создать массив из 5 фигур.
        Вывести на экран сумму периметра всех фигур в массиве.*/
        LinkedHashMap<String,Figure> figures = new LinkedHashMap<>();

        Circle circle = new Circle(10);
        circle.setRadius(10);
        figures.put("Circle",circle);

        Triangle triangle = new Triangle();
        triangle.setSidesLength(3,3,3);
        figures.put("Triangle",triangle);

        Rectangular rectangular = new Rectangular();
        rectangular.setSidesLength(2,2,2,2);
        figures.put("Rectangular",rectangular);

        double sum =0;


        for(Map.Entry<String, Figure> item : figures.entrySet()) {

            System.out.printf("Figure: %s  have perimeter: %f \n", item.getKey(), item.getValue().perimeter());
            sum += item.getValue().perimeter();
        }
        System.out.printf("\nsum = %f", sum);
    }



 }
