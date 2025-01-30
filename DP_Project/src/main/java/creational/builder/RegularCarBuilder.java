package main.java.creational.builder;

public class RegularCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("regular engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("regular wheels");
    }

    @Override
    public void buildColor() {
        car.setColor("boring color");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
