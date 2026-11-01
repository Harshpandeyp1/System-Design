package machine;

import state.*;

public class VendingMachine {
    private State state;

    public VendingMachine() {
        this.state = new IdleState(this);       // start state
    }

    public void setState(State state) {
        this.state = state;
    }

    // delegation: NO if/else anywhere
    public void insertMoney()   { state.insertMoney(); }
    public void selectProduct() { state.selectProduct(); }
    public void dispense()      { state.dispense(); }
}