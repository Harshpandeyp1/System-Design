package music;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Playlist implements Iterable<Song> {
    private Song[] songs = new Song[2];     // internal storage: hidden from clients
    private int size = 0;

    public void add(Song song) {
        if (size == songs.length) {
            songs = java.util.Arrays.copyOf(songs, size * 2);   // grow
        }
        songs[size++] = song;
    }

    // forward iteration (also powers the for-each loop)
    @Override
    public Iterator<Song> iterator() {
        return new ForwardIterator();
    }

    public Iterator<Song> reverseIterator() {
        return new ReverseIterator();
    }

    private class ForwardIterator implements Iterator<Song> {
        private int index = 0;                       // this iterator's own position

        @Override
        public boolean hasNext() { return index < size; }

        @Override
        public Song next() {
            if (!hasNext()) throw new NoSuchElementException();
            return songs[index++];
        }
    }

    private class ReverseIterator implements Iterator<Song> {
        private int index = size - 1;

        @Override
        public boolean hasNext() { return index >= 0; }

        @Override
        public Song next() {
            if (!hasNext()) throw new NoSuchElementException();
            return songs[index--];
        }
    }
}