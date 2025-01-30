package main.java.creational.builder;

public class SportsCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("sports car engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("sports car wheels");
    }

    @Override
    public void buildColor() {
        car.setColor("cool race color");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
