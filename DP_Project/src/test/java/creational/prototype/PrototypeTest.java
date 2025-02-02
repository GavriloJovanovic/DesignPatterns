package test.java.creational.prototype;

import main.java.creational.prototype.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {
    private Circle originalCircle;
    private Rectangle originalRectangle;

    @BeforeEach
    void setUp() {
        originalCircle = new Circle();
        originalCircle.x = 10;
        originalCircle.y = 20;
        originalCircle.color = "Red";
        originalCircle.radius = 15;

        originalRectangle = new Rectangle();
        originalRectangle.x = 5;
        originalRectangle.y = 10;
        originalRectangle.color = "Blue";
        originalRectangle.width = 25;
        originalRectangle.height = 30;
    }

    @Test
    void testCircleClone() {
        Circle clonedCircle = (Circle) originalCircle.clone();

        assertNotSame(originalCircle, clonedCircle, "Cloned circle should be a new instance");
        assertEquals(originalCircle, clonedCircle, "Cloned circle should have the same properties");
    }

    @Test
    void testRectangleClone() {
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        assertNotSame(originalRectangle, clonedRectangle, "Cloned rectangle should be a new instance");
        assertEquals(originalRectangle, clonedRectangle, "Cloned rectangle should have the same properties");
    }

    @Test
    void testCircleCloneModification() {
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.radius = 50;

        assertNotEquals(originalCircle.radius, clonedCircle.radius, "Cloned circle radius should be different when modified");
    }

    @Test
    void testRectangleCloneModification() {
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        clonedRectangle.width = 50;
        clonedRectangle.height = 60;

        assertNotEquals(originalRectangle.width, clonedRectangle.width, "Cloned rectangle width should be different when modified");
        assertNotEquals(originalRectangle.height, clonedRectangle.height, "Cloned rectangle height should be different when modified");
    }

    @Test
    void testShapeSuperclassClone() {
        Shape clonedShape = originalCircle.clone();

        assertNotSame(originalCircle, clonedShape, "Cloned shape should be a new instance");
        assertEquals(originalCircle, clonedShape, "Cloned shape should have the same properties as original shape");
    }
}