package main.java.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator createIterator() {
        return new SongIterator(songs);
    }
}
