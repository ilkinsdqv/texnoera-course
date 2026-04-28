package l9.oop.inheritance.objectclass.homework;

public class SalariedEmployee extends Employee {
    double monthlySalary;

    public SalariedEmployee(int age, String name, String department, String position, double monthlySalary) {
        super(age, name, department, position);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public Double collectPay() {
        return monthlySalary;
    }
}
