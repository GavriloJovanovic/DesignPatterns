package test.java.structural.proxy;

import main.java.structural.proxy.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyTest {

    @Test
    void testProxy() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            // Create Proxy
            ImageProxy imageProxy = new ImageProxy("photo.jpg");

            // First call - should load and display the image
            imageProxy.display();
            String consoleOutput = output.toString().trim();
            assertTrue(consoleOutput.contains("Loading photo.jpg"), "Image should be loaded");
            assertTrue(consoleOutput.contains("Displaying photo.jpg"), "Image should be displayed");

            // Clear output buffer
            output.reset();

            // Second call - should only display without loading
            imageProxy.display();
            consoleOutput = output.toString().trim();
            assertEquals("Displaying photo.jpg", consoleOutput, "Image should be displayed again without loading");

        } finally {
            // Reset System.out to original
            System.setOut(originalOut);
        }
    }
}
