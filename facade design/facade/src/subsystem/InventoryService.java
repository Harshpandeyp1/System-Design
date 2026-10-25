package subsystem;

public class InventoryService {
    public boolean isAvailable(String item) {
        System.out.println("Inventory: checking " + item);
        return true;
    }
    public void reserve(String item) {
        System.out.println("Inventory: reserved " + item);
    }
    public void release(String item) {
        System.out.println("Inventory: released " + item);
    }
}