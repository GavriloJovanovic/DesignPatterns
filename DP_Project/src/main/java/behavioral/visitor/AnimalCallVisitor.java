package main.java.behavioral.visitor;

public class AnimalCallVisitor implements AnimalVisitor {
    @Override
    public void visit(Cat cat) {
        System.out.println("Cat: " + cat.getName() + " psps");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Dog: " + dog.getName() + " come here");
    }

    @Override
    public void visit(Group group) {
        System.out.println("Calling all animals in the group...");
    }
}
