package subject;

import observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final String symbol;
    private double price;
    private final List<StockObserver> observers = new ArrayList<>();

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void subscribe(StockObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unsubscribe(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        if (newPrice == this.price) {
            return;                       // nothing changed, nobody to tell
        }
        this.price = newPrice;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(symbol, price);
        }
    }

    public double getPrice() { return price; }
    public String getSymbol() { return symbol; }
}