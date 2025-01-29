package main.creational.builder;

public interface CarBuilder {
    void buildEngine();
    void buildWheels();
    void buildColor();
    Car getCar();
}
