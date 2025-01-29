package main.behavioral.strategy;

public class Customer implements PaymentStrategy {
    private String name;
    private double amount;

    public Customer(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(int amount) {
        this.amount -= amount;
    }
}
