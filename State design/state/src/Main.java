import machine.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.selectProduct();   // rejected
        vm.insertMoney();     // Idle -> HasMoney
        vm.insertMoney();     // rejected
        vm.selectProduct();   // HasMoney -> Dispensing
        vm.insertMoney();     // rejected
        vm.dispense();        // Dispensing -> Idle
        vm.insertMoney();     // works again
    }
}