package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task08MediumMethodCalculator {
    public static void main(String[] args) {
        String choice = "1";
        int num1;
        int num2;
        String operation;
        Scanner sc = new Scanner(System.in);
        while(!choice.equals("0")){
            System.out.print("1. Number = ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("\n2. Number = ");
            num2 = Integer.parseInt(sc.nextLine());
            System.out.print("\nOperation = ");
            operation = sc.nextLine();
            printResult(num1, num2, operation);
            System.out.println("\nDo you want to continue? ");
            System.out.println("Press 0 for no. Press any key for yes\n\n");
            choice = sc.nextLine();
        }
        sc.close();
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int sub(int num1, int num2) {
        return num1 - num2;
    }

    static int mul(int num1, int num2) {
        return num1 * num2;
    }

    static int div(int num1, int num2) {
            return num1 / num2;
    }

    static int calc(int num1, int num2, String operator) {
        return switch (operator){
            case "+" -> add( num1, num2 );
            case "-" -> sub( num1, num2 );
            case "*" -> mul( num1, num2 );
            case "/" -> div( num1, num2 );
            default -> 0;
        };
    }

    static void printResult(int num1, int num2, String operator) {
        if(operator.equals("/") && num2 == 0){
            System.out.println("Cannot divide by zero");
        }else{
            System.out.printf("%d %s %d = %d%n", num1, operator, num2, calc(num1, num2, operator));
        }
    }
}
