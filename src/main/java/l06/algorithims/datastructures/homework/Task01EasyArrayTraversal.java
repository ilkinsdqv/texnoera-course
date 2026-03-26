package l06.algorithims.datastructures.homework;

import java.util.Random;

public class Task01EasyArrayTraversal {
    public static void main(String[] args) {
        //Create an int[] with at least 12 values.
        //Print all elements using:
        //classic for loop
        //enhanced for-each loop
        //Compute running sum and print final sum.
        //Print count of even and odd numbers.
        Random rand = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Classic for loop: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(arr[i] + " : " + sum);
            if (arr[i] % 2 == 0) {
                evenCount++;
            }else  {
                oddCount++;
            }
        }
        System.out.println("------------------------");
        sum = 0;
        System.out.println("Enhanced for-each loop: ");
        for (int i : arr) {
            sum += i;
            System.out.println(i + " : " + sum);
        }
        System.out.println("Total Sum: " + sum);
        System.out.println("Total even count: " + evenCount);
        System.out.println("Total odd count: " + oddCount);
    }
}
