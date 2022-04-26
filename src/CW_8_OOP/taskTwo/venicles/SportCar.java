package CW_8_OOP.taskTwo.venicles;

import CW_8_OOP.taskTwo.details.Engine;
import CW_8_OOP.taskTwo.profession.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar(String brand, String classCar, Double weight, Driver driver, Engine engine, int speed) {
        super(brand, classCar, weight, driver, engine);
        this.speed = speed;
    }
}
