// 1. The Target Interface that your client code expects
interface ModernPrinter {
    void print(String message);
}

// 2. The Adaptee (Legacy class with an incompatible interface)
class LegacyPrinter {
    public void printOld(String text) {
        System.out.println("Legacy Printer output: " + text);
    }
}

// 3. The Adapter that bridges the gap
class PrinterAdapter implements ModernPrinter {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String message) {
        // Translate the modern call to the legacy method call
        legacyPrinter.printOld(message);
    }
}

// 4. Client Code
public class Main {
    public static void main(String[] args) {
        // We have a legacy printer
        LegacyPrinter oldPrinter = new LegacyPrinter();

        // We wrap it with the adapter so it fits the ModernPrinter interface
        ModernPrinter printer = new PrinterAdapter(oldPrinter);

        // Client code uses the modern interface without worrying about the legacy details
        printer.print("Hello using the Adapter Pattern!");
    }
}