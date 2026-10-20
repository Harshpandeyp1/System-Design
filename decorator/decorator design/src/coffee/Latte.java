package coffee;

public class Latte implements Coffee {

    @Override
    public String getDescription() {
        return "Latte ";
    }

    @Override
    public Double getCost() {
        return 150.0;
    }
}
