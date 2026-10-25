import fs.File;
import fs.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");

        Folder docs = new Folder("docs");
        docs.add(new File("resume.pdf", 200));
        docs.add(new File("notes.txt", 50));

        Folder photos = new Folder("photos");
        photos.add(new File("trip.jpg", 1500));
        photos.add(new File("family.jpg", 2000));

        Folder archive = new Folder("archive");
        archive.add(new File("old.zip", 5000));
        photos.add(archive);                       // folder inside a folder

        root.add(docs);
        root.add(photos);
        root.add(new File("readme.md", 10));       // file directly in root

        root.print("");

        System.out.println("Total size of root: " + root.getSize() + " KB");
        System.out.println("Size of photos only: " + photos.getSize() + " KB");
    }
}