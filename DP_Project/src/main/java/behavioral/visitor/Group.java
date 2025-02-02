package main.java.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Group implements Animal {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        for (Animal animal : animals) {
            animal.accept(visitor);
        }
    }
}
