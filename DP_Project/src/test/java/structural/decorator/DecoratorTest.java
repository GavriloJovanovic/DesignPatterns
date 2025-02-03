package test.java.structural.decorator;

import main.java.structural.decorator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeDecoratorTest {

    @Test
    void testBasicCoffee() {
        Coffee coffee = new BasicCoffee();
        assertEquals("Basic Coffee", coffee.getDescription());
        assertEquals(5.0, coffee.getCost());
    }

    @Test
    void testCoffeeWithMilk() {
        Coffee coffee = new MilkDecorator(new BasicCoffee());
        assertEquals("Basic Coffee, Milk", coffee.getDescription());
        assertEquals(6.5, coffee.getCost());
    }

    @Test
    void testCoffeeWithMilkAndSugar() {
        Coffee coffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        assertEquals("Basic Coffee, Milk, Sugar", coffee.getDescription());
        assertEquals(7.0, coffee.getCost());
    }

    @Test
    void testFullCoffee() {
        Coffee coffee = new CaramelDecorator(new SugarDecorator(new MilkDecorator(new BasicCoffee())));
        assertEquals("Basic Coffee, Milk, Sugar, Caramel", coffee.getDescription());
        assertEquals(9.0, coffee.getCost());
    }
}
