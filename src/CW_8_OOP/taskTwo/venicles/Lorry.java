package CW_8_OOP.taskTwo.venicles;

import CW_8_OOP.taskTwo.details.Engine;
import CW_8_OOP.taskTwo.profession.Driver;

public class Lorry extends Car{
    private int weight;

    public Lorry(String brand, String classCar, Double weight, Driver driver, Engine engine, int weight1) {
        super(brand, classCar, weight, driver, engine);
        this.weight = weight1;
    }
}
