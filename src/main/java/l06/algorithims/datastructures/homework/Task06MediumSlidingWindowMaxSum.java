package l06.algorithims.datastructures.homework;

import java.util.Arrays;
import java.util.Random;

public class Task06MediumSlidingWindowMaxSum {
    public static void main(String[] args) {
        //Read or define k and integer array.
        //Compute max sum of every contiguous subarray of size k.
        //Track starting index of best window.
        //Print max sum and the winning window.
        //Validate invalid k values (k <= 0 or k > arr.length).
        Random random = new Random();
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
        int k = 4;
        findBestWindow(nums, k);
    }

    private static void findBestWindow(int[] nums, int k) {
        if(k<=0 || k>nums.length){
            System.out.println("Invalid Input: k must be between 1 and " + nums.length);
        }else{
            System.out.println("Array: " + Arrays.toString(nums));
            int sum = 0;
            int index = 0;
            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }
            int maxSum = sum;
            for (int i = 1; i <= nums.length - k; i++) {
                sum += nums[i + k - 1];
                sum -= nums[i - 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    index = i;
                }
            }
            int[] bestWindow = Arrays.copyOfRange(nums, index, index + k);
            System.out.println("Winning Window: " + Arrays.toString(bestWindow));
            System.out.println("Max Sum: " + maxSum);
        }
    }
}
