package l9.oop.inheritance.objectclass.homework;

public abstract class Employee extends Worker {
    private String department;
    private String position;

    public Employee(int age, String name, String department, String position) {
        super(age, name);
        this.department = department;
        this.position = position;
    }

    public abstract Double collectPay();

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void payroolReport() {
        String report = "id: %-2d | name: %-10s | age: %d2 | department: %-10s | position: %-15s | hire date: %s | salary: %.2f"
                .formatted(getEmployeeId(), getName(), getAge(), getDepartment(), getPosition(), getHireDate(), collectPay());
        System.out.println(report);
    }
}
