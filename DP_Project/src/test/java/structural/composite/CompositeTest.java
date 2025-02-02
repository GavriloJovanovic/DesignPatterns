package test.java.structural.composite;

import main.java.structural.composite.*;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {

    @Test
    void testShowDetails() {
        Employee dev1 = new Developer("Alice", "Frontend");
        Employee dev2 = new Developer("Bob", "Backend");
        Employee manager = new Manager("Carol", "IT");

        CompositeDirectory directory = new CompositeDirectory();
        directory.addEmployee(dev1);
        directory.addEmployee(dev2);
        directory.addEmployee(manager);

        String shouldBe = "Developer: " + "Alice" + ", Position: " + "Frontend\n"
                + "Developer: " + "Bob" + ", Position: " + "Backend\n"
                + "Manager: " + "Carol" + ", Department: " + "IT\n";
        assertEquals(shouldBe, directory.showDetails(), "Show details ment to work like this");
    }
}
