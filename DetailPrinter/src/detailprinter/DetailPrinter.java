package detailprinter;

import java.util.ArrayList;
import java.util.List;

public class DetailPrinter {
    
    public static void main(String[] args) {
        Employee employee = new Employee ("Tata");
        List <String> document = new ArrayList<>();
        document.add("Doc 1");
        document.add("Doc 2");
        Manager manager = new Manager ("Fatharani", document);
        List <Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);
        DetailsPrinter printer = new DetailsPrinter(employees);
        printer.printDetails();
    }
    
}
