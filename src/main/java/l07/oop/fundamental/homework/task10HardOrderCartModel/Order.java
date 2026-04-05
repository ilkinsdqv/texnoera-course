package l07.oop.fundamental.homework.task10HardOrderCartModel;

public class Order {
    public CartItem[] items;

    public Order(CartItem[] items) {
        this.items = items;
    }

    public double calculateSubtotal() {
        double subtotal = 0;
        for (CartItem item : items) {
            subtotal += item.price * item.quantity;
        }
        return subtotal;
    }

    public double calculateTotal(double taxRate, double shipping) {
        double subtotal = calculateSubtotal();
        return subtotal + (subtotal * taxRate / 100) + shipping;
    }

    public void printInvoice(double taxRate, double shipping) {
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Item", "Price", "Quantity", "Total");

        for (CartItem item : items) {
            System.out.printf("%-20s %-15.2f %-15d %-15.2f%n", item.name, item.price, item.quantity, item.price * item.quantity);
        }

        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Shipping: " + shipping);
        System.out.println("Total: " + calculateTotal(taxRate, shipping));
    }
}
