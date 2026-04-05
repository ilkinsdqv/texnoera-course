package l07.oop.fundamental.homework.task10HardOrderCartModel;

public class CartItem {
    public String name;
    public int quantity;
    public double price;

    public CartItem(String name, double price, int quantity) {
        if(quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0.");
        }
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
