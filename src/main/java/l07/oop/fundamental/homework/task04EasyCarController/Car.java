package l07.oop.fundamental.homework.task04EasyCarController;

public class Car {

    public String brand;
    public int speed = 0;
    public final int maxSpeed = 360;

    public void accelerate(int delta) {
        speed += delta;
        if(speed > maxSpeed){
            speed = maxSpeed;
            System.out.printf("%s riched maximum speed! %d kmph%n", brand, maxSpeed);
        }else{
            System.out.printf("%s`s speed increased %d kmph: %d%n", brand, delta, speed);
        }
    }

    public void brake(int delta) {
        speed -= delta;
        if(speed <= 0){
            speed = 0;
            System.out.printf("%s has stopped! %d kmph%n", brand, speed);
        }else{
            System.out.printf("%s slowed down %d kmph: %d kmph%n", brand, delta, speed);
        }
    }
}
