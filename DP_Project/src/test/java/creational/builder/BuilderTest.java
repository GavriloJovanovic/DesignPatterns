package test.java.creational.builder;

import main.java.creational.builder.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    public void testRegularCarBuilder() {
        CarBuilder builder = new RegularCarBuilder();
        Director director = new Director(builder);

        Car car = director.constructCar();

        assertEquals(car.getColor(), "boring color", "Color should be 'boring color'");
        assertEquals(car.getEngine(), "regular engine", "Engine should be 'regular engine'");
        assertEquals(car.getWheels(), "regular wheels", "Wheels should be 'regular wheels'");
    }

    @Test
    public void testSportsCarBuilder() {

        CarBuilder builder = new SportsCarBuilder();
        Director director = new Director(builder);

        Car car = director.constructCar();

        assertEquals(car.getColor(), "cool race color", "Color should be 'cool race color'");
        assertEquals(car.getEngine(), "sports car engine", "Engine should be 'sports car engine'");
        assertEquals(car.getWheels(), "sports car wheels", "Wheels should be 'sports car wheels'");
    }
}
