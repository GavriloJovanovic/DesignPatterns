package main.java.behavioral.visitor;

public class AnimalEatVisitor implements AnimalVisitor {
    @Override
    public void visit(Cat cat) {
        System.out.println("Cat " + cat.getName() + " eats fish");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Dog " + dog.getName() + " eats bones");
    }

    @Override
    public void visit(Group group) {
        System.out.println("Feeding all animals in the group...");
    }
}
