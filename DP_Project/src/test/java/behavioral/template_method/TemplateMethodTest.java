package test.java.behavioral.template_method;

import main.java.behavioral.template_method.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TemplateMethodTest {

    private ByteArrayOutputStream output;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        // Ensure output is initialized before each test
        output = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(output));
    }

    @Test
    void testOnlineOrderProcess() {
        OrderProcessTemplate onlineOrder = new OnlineOrder();
        onlineOrder.processOrder();

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("Item selected."));
        assertTrue(consoleOutput.contains("Payment made online using credit card."));
        assertTrue(consoleOutput.contains("Item delivered to the given address."));
        assertTrue(consoleOutput.contains("Order confirmation sent."));
    }

    @Test
    void testStorePickupOrderProcess() {
        OrderProcessTemplate storeOrder = new StorePickupOrder();
        storeOrder.processOrder();

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("Item selected."));
        assertTrue(consoleOutput.contains("Payment made at store."));
        assertTrue(consoleOutput.contains("Customer picked up item from store."));
        assertTrue(consoleOutput.contains("Order confirmation sent."));
    }

    @BeforeEach
    void tearDown() {
        // Restore original System.out after tests
        System.setOut(originalOut);
    }
}