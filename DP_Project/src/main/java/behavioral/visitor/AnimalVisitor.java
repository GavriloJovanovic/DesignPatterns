package main.java.behavioral.visitor;

import main.java.behavioral.visitor.*;

public interface AnimalVisitor {
    void visit(Cat cat);
    void visit(Dog dog);
    void visit(Group group);
}