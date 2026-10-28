public class ProxyImage implements Image{
    private String filename;
    private RealImage realImage;
    public ProxyImage(String filename) {
        this.filename = filename;
        // Notice: We DO NOT instantiate RealImage here.
        // Construction is lightweight and instantaneous.
    }
    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("[ProxyImage] RealImage not loaded yet. Initializing now...");
            realImage = new RealImage(filename);
        } else {
            System.out.println("[ProxyImage] Fetching cached RealImage instance.");
        }

        // Delegation: Forward the actual work to the real object
        realImage.display();
    }
    }

