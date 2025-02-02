package test.java.behavioral.visitor;

import main.java.behavioral.visitor.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalVisitorTest {

    @Test
    public void testCatCall() {
        Cat cat = new Cat("Whiskers");
        AnimalCallVisitor callVisitor = new AnimalCallVisitor();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        cat.accept(callVisitor);

        assertTrue(output.toString().contains("Cat: Whiskers psps"));
    }

    @Test
    public void testDogCall() {
        Dog dog = new Dog("Buddy");
        AnimalCallVisitor callVisitor = new AnimalCallVisitor();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        dog.accept(callVisitor);

        assertTrue(output.toString().contains("Dog: Buddy come here"));
    }

    @Test
    public void testGroupCall() {
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Buddy");
        Group group = new Group();
        group.addAnimal(cat);
        group.addAnimal(dog);

        AnimalCallVisitor callVisitor = new AnimalCallVisitor();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        group.accept(callVisitor);
        assertTrue(output.toString().contains("Cat: Whiskers psps"));
        assertTrue(output.toString().contains("Dog: Buddy come here"));
    }

    @Test
    public void testCatEating() {
        Cat cat = new Cat("Whiskers");
        AnimalEatVisitor eatVisitor = new AnimalEatVisitor();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        cat.accept(eatVisitor);

        assertTrue(output.toString().contains("Cat Whiskers eats fish"));
    }

    @Test
    public void testDogSound() {
        Dog dog = new Dog("Buddy");
        AnimalSoundVisitor soundVisitor = new AnimalSoundVisitor();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        dog.accept(soundVisitor);

        assertTrue(output.toString().contains("Dog Buddy says Woof"));
    }
}