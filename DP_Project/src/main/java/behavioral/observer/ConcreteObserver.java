package main.java.behavioral.observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }
    @Override
    public String update(String message) {
        return this.name + " received: " + message;
    }
}
