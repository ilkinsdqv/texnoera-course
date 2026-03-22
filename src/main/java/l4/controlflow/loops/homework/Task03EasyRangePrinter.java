package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task03EasyRangePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startInt = sc.nextInt();
        int endInt = sc.nextInt();
        sc.close();
        int sum = 0;
        if(startInt > endInt) {
            int temp = startInt;
            startInt = endInt;
            endInt = temp;
        }
        for (int i = startInt; i < endInt; i++) {
            sum += i;
            System.out.println(i + " -> Sum = " + sum);
            if(i % 3 == 0) System.out.println(i + " can divide by 3");
        }
        System.out.println("Final Sum = " + sum);
    }
}
