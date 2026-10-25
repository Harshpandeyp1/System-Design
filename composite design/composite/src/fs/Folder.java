package fs;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public String getName() { return name; }

    @Override
    public long getSize() {
        long total = 0;
        for (FileSystemItem child : children) {
            total += child.getSize();      // works for files AND folders
        }
        return total;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "[" + name + "] (" + getSize() + " KB)");
        for (FileSystemItem child : children) {
            child.print(indent + "    ");
        }
    }
}