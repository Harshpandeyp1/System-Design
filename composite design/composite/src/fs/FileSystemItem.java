package fs;

public interface FileSystemItem {
    String getName();
    long getSize();
    void print(String indent);
}
