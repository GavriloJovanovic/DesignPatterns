package main.java.creational.factory;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        // wrong shape type
        return null;
    }
}
