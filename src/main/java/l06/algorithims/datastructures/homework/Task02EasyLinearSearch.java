package l06.algorithims.datastructures.homework;

import java.util.Random;
import java.util.Scanner;

public class Task02EasyLinearSearch {
    public static void main(String[] args) {
        //Read target number from console.
        //Search target in a predefined integer array using linear search.
        //If found, print first index and value.
        //If not found, print Not found.
        //Add a method linearSearch(int[] arr, int target) returning index or -1
        int[] nums = {10,23,41,213,43,12,53,64,12, 91};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(input.nextLine());
        int result = linearSearch(nums, number);
        if(result != -1){
            System.out.printf("Index: %d -> value: %d\n", result, number);
        }else{
            System.out.println("Not found!");
        }
    }

    static int linearSearch(int[] nums, int number) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
