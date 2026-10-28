public class Main {
    public static void main(String[] args) {
        // Client interacts with the Image interface via the Proxy
        Image image = new ProxyImage("ultra_hd_nature_wallpaper.png");

        System.out.println("--- 1. Proxy object instantiated. Notice no heavy disk load occurred yet ---");

        System.out.println("\n--- 2. First call to display(): Triggers lazy load ---");
        image.display();

        System.out.println("\n--- 3. Second call to display(): Uses already loaded real instance ---");
        image.display();
    }
}