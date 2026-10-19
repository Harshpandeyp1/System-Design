package observer;

public class EmailObserver implements StockObserver {
    private final String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String symbol, double price) {
        System.out.println("[Email to " + email + "] " + symbol + " price changed to Rs." + price);
    }
}