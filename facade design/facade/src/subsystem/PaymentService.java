package subsystem;

public class PaymentService {
    public boolean charge(String user, double amount) {
        System.out.println("Payment: charged Rs." + amount + " to " + user);
        return amount > 0;
    }
}