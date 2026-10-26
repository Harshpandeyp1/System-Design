package exporter;

import java.util.List;

public class JsonExporter extends DataExporter {

    @Override
    protected String format(List<String> data) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < data.size(); i++) {
            String row = data.get(i);
            if (row == null || row.isBlank()) {
                continue; // Skip empty rows safely
            }

            // Split into at most 2 parts to handle commas within names safely
            String[] parts = row.split(",", 2);
            String name = parts[0].trim();
            String marks = (parts.length > 1) ? parts[1].trim() : "0";

            // Append safely formatted JSON object
            sb.append("{\"name\":\"").append(escapeJson(name))
                    .append("\",\"marks\":").append(marks).append("}");

            if (i < data.size() - 1) {
                sb.append(",");
            }
        }

        return sb.append("]").toString();
    }

    /**
     * Basic helper to escape quotes in JSON strings.
     */
    private String escapeJson(String value) {
        return value.replace("\"", "\\\"");
    }

    @Override
    protected void write(String output) {
        System.out.println("Writing report.json:\n" + output);
    }

    @Override
    protected boolean shouldLog() {
        // Overriding the hook to disable logging
        return false;
    }
}