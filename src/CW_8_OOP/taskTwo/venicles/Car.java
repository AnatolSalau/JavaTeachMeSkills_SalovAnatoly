package CW_8_OOP.taskTwo.venicles;

import CW_8_OOP.taskTwo.details.Engine;
import CW_8_OOP.taskTwo.profession.Driver;

public class Car {
    private String brand;
    private String classCar;
    private Double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String classCar, Double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classCar = classCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
