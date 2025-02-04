package test.java.behavioral.iterator;

import main.java.behavioral.iterator.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    private PlayList playlist;

    @BeforeEach
    void setUp() {
        playlist = new PlayList();
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen"));
        playlist.addSong(new Song("Hotel California", "Eagles"));
        playlist.addSong(new Song("Imagine", "John Lennon"));
    }

    @Test
    void testIterator() {
        Iterator iterator = playlist.createIterator();

        assertTrue(iterator.hasNext());
        assertEquals("\"Bohemian Rhapsody\" by Queen", iterator.next().toString());

        assertTrue(iterator.hasNext());
        assertEquals("\"Hotel California\" by Eagles", iterator.next().toString());

        assertTrue(iterator.hasNext());
        assertEquals("\"Imagine\" by John Lennon", iterator.next().toString());

        assertFalse(iterator.hasNext()); // No more songs left
    }
}