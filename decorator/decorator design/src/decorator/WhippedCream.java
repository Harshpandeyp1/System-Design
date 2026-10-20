package decorator;

import coffee.Coffee;

public class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) { super(coffee); }

    @Override
    public String getDescription() { return coffee.getDescription() + ", Whipped Cream"; }

    @Override
    public Double getCost() { return coffee.getCost() + 40; }
}