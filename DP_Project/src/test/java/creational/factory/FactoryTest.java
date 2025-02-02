package test.java.creational.factory;

import main.java.creational.factory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    void testCircleDraw() {
        Shape circle = ShapeFactory.createShape("CIRCLE");
        assertInstanceOf(Circle.class, circle, "Circle should be created");
        assertEquals(circle.draw(),"DRAWING CIRCLE", "Circle should be drawm");
    }

    @Test
    void testRectangleDraw() {
        Shape rectangle = ShapeFactory.createShape("RECTANGLE");
        assertInstanceOf(Rectangle.class, rectangle, "Rectangle should be created");
        assertEquals(rectangle.draw(),"DRAWING RECTANGLE", "Rectangle should be drawm");
    }

    @Test
    void testWrongShapeType() {
        Shape cube = ShapeFactory.createShape("CUBE");
        assertNull(cube, "Nothing should be created");
    }
}
