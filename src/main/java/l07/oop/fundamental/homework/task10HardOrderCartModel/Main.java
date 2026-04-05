package l07.oop.fundamental.homework.task10HardOrderCartModel;

public class Main {
    public static void main(String[] args) {
        CartItem[] myCart = {
                new CartItem("Java Book", 45.50, 1),
                new CartItem("Mechanical Keyboard", 120.00, 1),
                new CartItem("USB-C Cable", 15.00, 3),
                new CartItem("Invalid Item", 10.00, 5)
        };

        Order myOrder = new Order(myCart);
        myOrder.printInvoice(8.5, 5.99);
    }
}
