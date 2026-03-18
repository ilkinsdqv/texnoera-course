package l03.variables.homework;

import java.math.BigDecimal;

public class Task05MediumInvoicePrecision {
    public static void main(String[] args) {
        /*Build an invoice with decimal values (example: 19.99, 5.75, 2.40) using double.
Compute invoice total with double and print it.
Rebuild the same invoice using BigDecimal string constructors.
Compute exact BigDecimal total and print it.
Print the numeric difference between both totals.*/
        double value1 = 19.99;
        double value2 = 5.75;
        double value3 = 2.40;
        double totalDouble = value1 + value2 + value3;
        System.out.println("Double : " + totalDouble);
        BigDecimal bigDecimalValue1 = new BigDecimal("19.99");
        BigDecimal bigDecimalValue2 = new BigDecimal("5.75");
        BigDecimal bigDecimalValue3 = new BigDecimal("2.40");
        BigDecimal totalBigDecimal = bigDecimalValue1.add(bigDecimalValue2).add(bigDecimalValue3);
        BigDecimal difference = totalBigDecimal.subtract(BigDecimal.valueOf(totalDouble));
        System.out.println("Big Decimal : " + totalBigDecimal);
        System.out.println("Difference : " + difference + "\nDifference(plain) : " + difference.toPlainString());
    }
}
