package main.java.behavioral.visitor;

public interface Animal {
    void accept(AnimalVisitor visitor);
}