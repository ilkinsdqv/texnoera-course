package l03.variables.homework;

public class Task01EasyEmployeeBadge {

    public static void main(String[] args) {
        String employeeName = "Ilkin";
        int employeeAge = 28;
        String department = "IT";
        int yearsAtCompany = 5;
        boolean activeStatus = true;
        double hourlyRate = 20.0;
        final String COMPANY_NAME = "ABC";

        hourlyRate += 10;
        System.out.printf("Employee Name: %-10s | Employee Age: %-3d | Department: %-5s | Years At Company: %-3d years | Active Status: %-10s | Hourly Rate: %.2f | Company Name: %-15s \n", employeeName,  employeeAge, department, yearsAtCompany, activeStatus ? "Active" : "Not Active", hourlyRate, COMPANY_NAME);
    }
}
