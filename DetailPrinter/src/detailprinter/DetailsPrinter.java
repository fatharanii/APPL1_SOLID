package detailprinter;

import java.util.List;

public class DetailsPrinter {
    private List<Employee> employees;
    
    public DetailsPrinter (List<Employee> employee){
        this.employees = employee;
    }
    
    public void printDetails(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
