package Relationships_or_Associations;

class Printer {
    void print(String data) {
        System.out.println(data);
    }
}

class Report {
    void generateReport(Printer printer) {  // USES-A relationship
        printer.print("Report Generated");
    }
}

public class USES_A_Relationship {

}
