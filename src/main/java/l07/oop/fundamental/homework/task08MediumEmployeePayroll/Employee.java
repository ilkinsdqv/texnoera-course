package l07.oop.fundamental.homework.task08MediumEmployeePayroll;

public class Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateNetSalary(double taxRate) {
        if(taxRate > 0 && taxRate < 1) {
            return (baseSalary+bonus) - ((baseSalary + bonus) * taxRate);
        }else{
            throw new IllegalArgumentException("Invalid tax rate");
        }
    }

    public void printSalaryReport() {
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
    }
}
