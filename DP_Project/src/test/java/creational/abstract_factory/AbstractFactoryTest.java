package test.java.creational.abstract_factory;


import main.java.creational.abstract_factory.*;
import main.java.structural.proxy.ImageProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {
    Application app;

    @BeforeEach
    void configurateApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
    }

    @Test
    void testAbstractFactoryTest() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            app.paint();
            String consoleOutput = output.toString().trim();
            assertTrue(output.toString().equals("WindowsButton paint...\r\nWindowsCheckbox paint...\r\n"));
        } finally {
            // Reset System.out to original
            System.setOut(originalOut);
        }
    }
}
