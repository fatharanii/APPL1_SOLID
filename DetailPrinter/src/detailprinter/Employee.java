package detailprinter;

public class Employee {
    public String name;
    public Employee (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
