package l07.oop.fundamental.homework.task05MediumProductEncapsulation;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Apple");
        product.setPrice(10);
        product.setStock(100);
        product.sell(50);
    }
}
