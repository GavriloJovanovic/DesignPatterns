package main.java.behavioral.iterator;

import java.util.List;

public class SongIterator implements Iterator {
    private final List<Song> songs;
    private int position = 0;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Object next() {
        return hasNext() ? songs.get(position++) : null;
    }
}
