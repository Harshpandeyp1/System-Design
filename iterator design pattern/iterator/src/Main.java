import music.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add(new Song("Kesariya", "Arijit Singh"));
        playlist.add(new Song("Tum Hi Ho", "Arijit Singh"));
        playlist.add(new Song("Chaleya", "Arijit Singh"));

        System.out.println("--- Forward (for-each) ---");
        for (Song s : playlist) {
            System.out.println(s);
        }

        System.out.println("--- Reverse ---");
        Iterator<Song> it = playlist.reverseIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}