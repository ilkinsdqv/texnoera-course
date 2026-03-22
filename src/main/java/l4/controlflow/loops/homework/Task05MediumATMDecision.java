package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task05MediumATMDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountBalance = sc.nextInt();
        int withdrawalAmount = sc.nextInt();
        sc.close();
        if(withdrawalAmount <= 0){
            System.out.println("Invalid amount");
        }
        else if(accountBalance <= 0){
            System.out.println("No funds available");
        }
        else if(withdrawalAmount > accountBalance) {
            System.out.println("Insufficient balance");
        } else if (withdrawalAmount > 500) {
            System.out.println("OTP required");
        }else{
            System.out.println("Approved");
            System.out.printf("Updated balance: %d - %d = %d", accountBalance, withdrawalAmount, accountBalance-withdrawalAmount);
        }

    }
}
