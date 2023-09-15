package entities;

public class Employee {

    public String Name;
    public double GrossSalary;
    public double Tax;

    public double netSalary(){
        return GrossSalary - Tax;
    }

    public void increaseSalary(double percentage){
        this.GrossSalary += (GrossSalary * percentage) / 100.0;
    }

    public String toString(){
        return "Employee: " + Name + ", $ " + String.format("%.2f", netSalary());
    }

}
