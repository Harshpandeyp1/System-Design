package facade;

import subsystem.*;

public class OrderFacade {
    private final InventoryService inventory;
    private final PaymentService payment;
    private final ShippingService shipping;
    private final NotificationService notifier;

    public OrderFacade(InventoryService inventory, PaymentService payment,
                       ShippingService shipping, NotificationService notifier) {
        this.inventory = inventory;
        this.payment = payment;
        this.shipping = shipping;
        this.notifier = notifier;
    }

    public boolean placeOrder(String user, String item, double amount, String address) {
        if (!inventory.isAvailable(item)) {
            notifier.send(user, item + " is out of stock");
            return false;
        }
        inventory.reserve(item);

        if (!payment.charge(user, amount)) {
            inventory.release(item);                 // undo the reservation
            notifier.send(user, "Payment failed");
            return false;
        }

        shipping.ship(item, address);
        notifier.send(user, "Order placed for " + item);
        return true;
    }
}