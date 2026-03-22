package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task07MediumMultiplicationGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rawSum = 0;
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i*j);
                rawSum += i*j;
            }
            System.out.println("Sum = " + rawSum);
            totalSum += rawSum;
            rawSum = 0;
            System.out.println("--------------");
        }
        System.out.println("Total sum = " + totalSum);
    }
}
