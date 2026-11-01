package state;

import machine.VendingMachine;

public class DispensingState implements State {
    private final VendingMachine machine;

    public DispensingState(VendingMachine machine) { this.machine = machine; }

    @Override
    public void insertMoney() { System.out.println("Please wait, dispensing"); }

    @Override
    public void selectProduct() { System.out.println("Please wait, dispensing"); }

    @Override
    public void dispense() {
        System.out.println("Product dispensed. Thank you!");
        machine.setState(new IdleState(machine));          // back to start
    }
}