package main.java.behavioral.visitor;

public interface Visitor {
    String visitDog(Dog dog);

    String visitCat(Cat cat);

    String visitGroup(Group group);
}
