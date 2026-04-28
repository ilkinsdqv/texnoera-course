package l9.oop.inheritance.objectclass.homework;

import java.time.LocalDate;

public class Worker extends Person {
    private final int employeeId;
    private LocalDate hireDate;
    private static int idCounter = 1;
    public Worker(int age, String name) {
        super(age, name);
        this.employeeId = idCounter++;
        this.hireDate = LocalDate.now();
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
