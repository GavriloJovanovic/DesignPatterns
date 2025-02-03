package main.java.structural.decorator;

// Caramel Decorator
public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}