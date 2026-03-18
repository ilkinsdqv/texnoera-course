package l03.variables.homework;

public class Task02EasyCartTotals {
    public static void main(String[] args) {
        int quantity1 = 4;
        double unitPrice = 22.5;
        int quantity2 = 6;
        double unitPrice2 = 7.25;
        int quantity3 = 3;
        double unitPrice3 = 6.75;

        double deliveryFee = 5.0;
        double platformFee = 2.5;

        double discount = 10.0;

        double subtotal = unitPrice * quantity1 + unitPrice2 * quantity2 + unitPrice3 * quantity3;

        double total = subtotal + deliveryFee + platformFee;
        total -= discount;

        System.out.printf("Subtotal : %.2f | Fees(Delivery+Platform) : %.2f | Discount : %.2f | Total : %.2f%n",
                subtotal, deliveryFee+platformFee, discount,  total);

    }
}
