package l07.oop.fundamental.homework.task04EasyCarController;

public class Main {
    public static void main(String[] args) {
        //Create a Car class with fields: brand, speed, maxSpeed.
        //Add methods:
        //accelerate(int delta)
        //brake(int delta)
        //Ensure speed is always between 0 and maxSpeed.
        //Print speed after each operation.
        Car audi = new Car();
        audi.brand = "Audi";
        audi.brake(20);
        audi.accelerate(100);
        audi.accelerate(200);
        audi.accelerate(150);
        audi.brake(100);
    }
}
