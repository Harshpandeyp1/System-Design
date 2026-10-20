package decorator;

import coffee.Coffee;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) { super(coffee); }

    @Override
    public String getDescription() { return coffee.getDescription() + ", Sugar"; }

    @Override
    public Double getCost() { return coffee.getCost() + 10; }
}