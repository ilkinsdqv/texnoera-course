package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task01EasyAgeClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =  sc.nextInt();
        if(age < 0) {
            System.out.println("Invalid input");
        } else if (age >= 0 && age <= 12) {
            System.out.println("You are child");
        } else if (age >= 13 && age <= 17) {
            System.out.println("You are teen");
        } else if (age >= 18 && age <= 64) {
            System.out.println("You are adult");
        } else if (age >= 65) {
            System.out.println("You are senior");
        }
    }
}
