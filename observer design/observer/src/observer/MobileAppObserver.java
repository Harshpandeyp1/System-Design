package observer;

public class MobileAppObserver implements StockObserver {
    private final String userName;

    public MobileAppObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String symbol, double price) {
        System.out.println("[Mobile - " + userName + "] " + symbol + " is now Rs." + price);
    }
}