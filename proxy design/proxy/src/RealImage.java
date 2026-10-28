public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    private void loadFromDisk(){
        System.out.println("[RealImage] Loading high-resolution image from disk: " + filename);
        try {
            // Simulate disk/network latency
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("[RealImage] Displaying rendered image: " + filename);
    }
}
