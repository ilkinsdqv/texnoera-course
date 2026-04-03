package l07.oop.fundamental.homework.task08MediumEmployeePayroll;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Elxan", 700, 300);
        Employee e2 = new Employee("Eli", 1200, 300);
        Employee e3 = new Employee("Vahid", 800, 200);

        e1.printSalaryReport();
        System.out.println("Net Salary: " + e1.calculateNetSalary(0.125));

        e2.printSalaryReport();
        System.out.println("Net Salary: " + e2.calculateNetSalary(1));

        e3.printSalaryReport();
        System.out.println("Net Salary: " + e3.calculateNetSalary(0.115));

    }
}
