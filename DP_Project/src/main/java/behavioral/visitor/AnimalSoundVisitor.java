package main.java.behavioral.visitor;

public class AnimalSoundVisitor implements AnimalVisitor {
    @Override
    public void visit(Cat cat) {
        System.out.println("Cat " + cat.getName() + " says Meow");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Dog " + dog.getName() + " says Woof");
    }

    @Override
    public void visit(Group group) {
        System.out.println("All animals in the group make their sounds...");
    }
}
