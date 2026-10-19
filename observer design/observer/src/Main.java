import observer.EmailObserver;
import observer.MobileAppObserver;
import subject.Stock;

public class Main {
    public static void main(String[] args) {
        Stock tcs = new Stock("TCS", 3500);

        MobileAppObserver rahul = new MobileAppObserver("Rahul");
        EmailObserver anita = new EmailObserver("anita@mail.com");

        tcs.subscribe(rahul);
        tcs.subscribe(anita);

        System.out.println("--- Price change 1 ---");
        tcs.setPrice(3550);

        tcs.unsubscribe(rahul);

        System.out.println("--- Price change 2 (Rahul unsubscribed) ---");
        tcs.setPrice(3600);
    }
}