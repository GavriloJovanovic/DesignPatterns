package test.java.behavioral.command;

import main.java.behavioral.command.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CommandTest {

    private RemoteControl remote;  // Ensure this is initialized in @BeforeEach
    private Light light;
    private Fan fan;
    private Command lightOn;
    private Command lightOff;
    private Command fanOn;
    private Command fanOff;
    private ByteArrayOutputStream output;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        // Initialize remote control and devices
        remote = new RemoteControl();
        light = new Light();
        fan = new Fan();
        lightOn = new LightOnCommand(light);
        lightOff = new LightOffCommand(light);
        fanOn = new FanOnCommand(fan);
        fanOff = new FanOffCommand(fan);

        // Redirect console output to capture system output for assertions
        output = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(output));
    }

    @Test
    void testLightOnCommand() {
        remote.setCommand(lightOn);
        remote.pressButton();
        assertTrue(output.toString().contains("Light is ON"));

        output.reset();  // Clear buffer before next assertion

        remote.pressUndo();
        assertTrue(output.toString().contains("Light is OFF"));
    }

    @Test
    void testLightOffCommand() {
        remote.setCommand(lightOff);
        remote.pressButton();
        assertTrue(output.toString().contains("Light is OFF"));

        output.reset();

        remote.pressUndo();
        assertTrue(output.toString().contains("Light is ON"));
    }

    @Test
    void testFanOnCommand() {
        remote.setCommand(fanOn);
        remote.pressButton();
        assertTrue(output.toString().contains("Fan is ON"));

        output.reset();

        remote.pressUndo();
        assertTrue(output.toString().contains("Fan is OFF"));
    }

    @Test
    void testFanOffCommand() {
        remote.setCommand(fanOff);
        remote.pressButton();
        assertTrue(output.toString().contains("Fan is OFF"));

        output.reset();

        remote.pressUndo();
        assertTrue(output.toString().contains("Fan is ON"));
    }

    @BeforeEach
    void tearDown() {
        // Restore original system output after tests
        System.setOut(originalOut);
    }
}
