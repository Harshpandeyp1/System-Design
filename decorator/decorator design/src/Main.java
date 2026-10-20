import coffee.*;
import decorator.*;

public class Main {
    public static void main(String[] args) {

        Coffee order1 = new Espresso();
        System.out.println(order1.getDescription() + " = Rs." + order1.getCost());

        Coffee order2 = new Milk(new Sugar(new Latte()));
        System.out.println(order2.getDescription() + " = Rs." + order2.getCost());

        // double milk: impossible with inheritance, trivial here
        Coffee order3 = new Milk(new Milk(new WhippedCream(new Espresso())));
        System.out.println(order3.getDescription() + " = Rs." + order3.getCost());
    }
}