package decorator;

import coffee.Coffee;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getCost()+"Milk";
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 20;
    }
}
