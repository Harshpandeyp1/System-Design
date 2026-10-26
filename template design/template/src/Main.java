import exporter.*;

public class Main {
    public static void main(String[] args) {
        DataExporter csv = new CsvExporter();
        csv.export();

        System.out.println("-----------");

        DataExporter json = new JsonExporter();
        json.export();
    }
}