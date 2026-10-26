package exporter;

import java.util.List;

public class CsvExporter extends DataExporter {
    @Override
    protected String format(List<String> data) {
        return "name,marks"+String.join("\n",data);
    }

    @Override
    protected void write(String output) {
        System.out.println("Writing report.csv:\n" + output);
    }
}
