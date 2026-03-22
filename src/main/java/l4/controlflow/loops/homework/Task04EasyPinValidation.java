package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task04EasyPinValidation {
    public static void main(String[] args) {
        //Set a fixed PIN constant in code (example: 1234).
        //Ask user for PIN using a do-while loop.
        //Allow maximum 3 attempts.
        //If correct, print success and stop.
        //If attempts are exhausted, print account locked message.
        final int PIN = 8234;
        int attempts = 1;
        int pin;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter PIN: ");
            pin = sc.nextInt();
            if(pin == PIN){
                System.out.println("Success");
                sc.close();
                break;
            }else{
                if(attempts != 3) {
                    System.out.printf("Failed. Account will be locked after %d attempts%n", 3 - attempts);
                }else{
                    System.out.println("Account is locked");
                }
                attempts++;
            }
        }while(attempts <= 3);
    }
}
