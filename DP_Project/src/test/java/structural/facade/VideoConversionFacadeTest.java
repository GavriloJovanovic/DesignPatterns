package test.java.structural.facade;

import main.java.structural.facade.VideoConversionFacade;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class VideoConversionFacadeTest {

    @Test
    void testVideoConversionToMP4() {
        VideoConversionFacade facade = new VideoConversionFacade();
        File result = facade.convertVideo("sample.ogg", "mp4");

        assertNotNull(result, "The converted file should not be null");
        assertEquals("tmp", result.getName(), "The output file should be named 'tmp'");
    }

    @Test
    void testVideoConversionToOgg() {
        VideoConversionFacade facade = new VideoConversionFacade();
        File result = facade.convertVideo("sample.mp4", "ogg");

        assertNotNull(result, "The converted file should not be null");
        assertEquals("tmp", result.getName(), "The output file should be named 'tmp'");
    }
}