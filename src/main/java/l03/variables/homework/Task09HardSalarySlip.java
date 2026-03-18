package l03.variables.homework;

import java.math.BigDecimal;

public class Task09HardSalarySlip {
    public static void main(String[] args) {
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal overtimeHours = new BigDecimal("20");
        BigDecimal overtimeRate = new BigDecimal("40");
        BigDecimal bonus = new BigDecimal("500");
        final double TAX_RATE = 12.5;
        final double PENSION_RATE = 2.5;

        BigDecimal grossSalary = baseSalary.add((overtimeHours.multiply(overtimeRate)).add(bonus));
        BigDecimal taxAmount = grossSalary.multiply(BigDecimal.valueOf(TAX_RATE)).divide(BigDecimal.valueOf(100));
        BigDecimal pensionAmount = grossSalary.multiply(BigDecimal.valueOf(PENSION_RATE)).divide(BigDecimal.valueOf(100));
        BigDecimal netSalary = grossSalary.subtract(taxAmount).subtract(pensionAmount);
        System.out.printf("%-20s : $%.2f%n", "Gross Salary", grossSalary);
        System.out.printf("%-20s : $%.2f%n", "Tax Rate", taxAmount);
        System.out.printf("%-20s : $%.2f%n", "Pension Rate", pensionAmount);
        System.out.printf("%-20s : $%.2f%n", "Net Salary", netSalary);

    }
}
