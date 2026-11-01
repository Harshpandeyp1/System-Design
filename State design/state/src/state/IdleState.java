package state;

import machine.VendingMachine;

public class IdleState implements State {
    private final VendingMachine machine;

    public IdleState(VendingMachine machine) { this.machine = machine; }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted");
        machine.setState(new HasMoneyState(machine));      // transition
    }

    @Override
    public void selectProduct() { System.out.println("Insert money first"); }

    @Override
    public void dispense() { System.out.println("Insert money first"); }
}