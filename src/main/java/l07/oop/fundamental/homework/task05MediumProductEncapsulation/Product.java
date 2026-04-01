package l07.oop.fundamental.homework.task05MediumProductEncapsulation;

public class Product {
    //Create Product class with private fields: name, price, stock.
    //Add getters and setters with validation:
    //price >= 0
    //stock >= 0
    //Add method sell(int quantity) that reduces stock safely.
    //Print product summary after operations.
    private String name;
    private double price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }else{
            System.out.println("Price cannot be negative");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock >= 0) {
            this.stock = stock;
        }else{
            System.out.println("Stock cannot be negative");
        }
    }

    public void sell(int quantity){
        if(quantity <= 0) {
            System.out.println("Quantity must be positive");
        }else if(quantity > stock) {
            System.out.println("Quantity must not be greater than stock");
        }else{
            printDetails();
            System.out.println("Selling quantity: " + quantity);
            System.out.println("Total price: " + price * quantity);
            stock -= quantity;
            System.out.println("Stock after: " + stock);
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
