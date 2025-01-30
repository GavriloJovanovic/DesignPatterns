package test.java.creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

import main.java.creational.singleton.SingletonClass;
import org.junit.jupiter.api.Test;

public class SingletonClassTest {

    @Test
    void testSingletonSameInstance() {
        // Create the first instance of SingletonClass
        SingletonClass instance1 = SingletonClass.getInstace("FirstValue");

        // Create the second instance of SingletonClass
        SingletonClass instance2 = SingletonClass.getInstace("SecondValue");

        // Assert that both instances refer to the same object
        assertSame(instance1, instance2, "Both instances should refer to the same object");

        // Assert that the value remains as "FirstValue" because Singleton only initializes once
        assertEquals("FirstValue", instance1.value, "Value should remain as the first initialized value");
        assertEquals("FirstValue", instance2.value, "Value should be consistent across all references");
    }
}