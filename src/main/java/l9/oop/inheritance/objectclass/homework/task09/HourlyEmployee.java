package l9.oop.inheritance.objectclass.homework.task09;

public class HourlyEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    public HourlyEmployee(int age, String name, String department, String position, double hourlyRate, int hoursWorked) {
        super(age, name, department, position);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public Double collectPay() {
        return hourlyRate * hoursWorked;
    }
}
