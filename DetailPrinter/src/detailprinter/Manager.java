package detailprinter;

import java.util.List;

public class Manager extends Employee{
    List<String> Documents;
    public Manager (String Name, List<String> documents){
        super(Name);
        this.Documents = documents;
    }
    public List<String> getDocuments(){
        return this.Documents;
    }
    public String toString(){
        return super.toString() + System.lineSeparator() + String.join(System.lineSeparator(), this.Documents);
    }
}
