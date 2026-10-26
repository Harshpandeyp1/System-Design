package exporter;

import java.util.List;

public abstract class DataExporter {

    // THE TEMPLATE METHOD: final, so subclasses cannot change the order
    public final void export() {
        List<String> data = fetchData();
        String output = format(data);
        write(output);
        if (shouldLog()) {          // a "hook"
            logDone();
        }
    }

    // common step, same for everyone
    protected List<String> fetchData() {
        System.out.println("Fetching data from database");
        return List.of("Rahul,85", "Anita,92", "Zoya,70");
    }

    // abstract steps: each subclass MUST implement
    protected abstract String format(List<String> data);
    protected abstract void write(String output);

    // common step
    protected void logDone() {
        System.out.println("Export completed");
    }

    // hook: optional step with a default; subclasses MAY override
    protected boolean shouldLog() {
        return true;
    }
}
