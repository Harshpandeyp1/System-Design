package state;

import machine.VendingMachine;

public class HasMoneyState implements State {
    private final VendingMachine machine;

    public HasMoneyState(VendingMachine machine) { this.machine = machine; }

    @Override
    public void insertMoney() { System.out.println("Money already inserted"); }

    @Override
    public void selectProduct() {
        System.out.println("Product selected");
        machine.setState(new DispensingState(machine));    // transition
    }

    @Override
    public void dispense() { System.out.println("Select a product first"); }
}