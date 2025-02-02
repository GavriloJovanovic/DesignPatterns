package main.java.behavioral.visitor;

import main.java.behavioral.visitor.*;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}