package l4.controlflow.loops.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task09HardNumberAnalytics {
    public static void main(String[] args) {
        start();
    }
    static void start(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number;
        int sum = 0;
        double average = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            sum += number;
            if (number < 0) {
                negatives++;
            }else if (number > 0) {
                positives++;
            }else{
                zeros++;
            }

            min = updateMin(min, number);
            max = updateMax(max, number);
        }
        sc.close();
        average = (double)sum / n;
        printSummary(n,sum, average, min, max , positives , negatives , zeros );
    }

    static int updateMin(int min, int number){
        return Math.min(number, min);
    }

    static int updateMax(int max, int number){
        return Math.max(number,max);
    }

    static void printSummary(int count, int sum, double average, int min, int max, int positives, int negatives, int zeros) {
        System.out.println("Total numbers read: " + count);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Positive count: " + positives);
        System.out.println("Negative count: " + negatives);
        System.out.println("Zero count: " + zeros);
    }
}