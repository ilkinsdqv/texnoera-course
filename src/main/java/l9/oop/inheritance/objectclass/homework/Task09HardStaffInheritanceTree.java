package l9.oop.inheritance.objectclass.homework;

public class Task09HardStaffInheritanceTree {
    public static void main(String[] args) {
        Employee[] employees = {
                new HourlyEmployee(30, "Alice", "IT", "Developer", 20.0, 160),
                new SalariedEmployee(45, "Bob", "HR", "Manager", 5000.0),
                new HourlyEmployee(25, "Charlie", "Sales", "Salesperson", 15.0, 120),
                new SalariedEmployee(35, "Dave", "Finance", "Analyst", 4000.0)
        };

        for (Employee employee : employees) {
            employee.payroolReport();
        }
    }
}
