import facade.OrderFacade;
import subsystem.*;

public class Main {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade(
                new InventoryService(),
                new PaymentService(),
                new ShippingService(),
                new NotificationService());

        facade.placeOrder("Rahul", "Keyboard", 1500, "Bhubaneswar");

        System.out.println("--- failing payment ---");
        facade.placeOrder("Anita", "Mouse", 0, "Cuttack");
    }
}