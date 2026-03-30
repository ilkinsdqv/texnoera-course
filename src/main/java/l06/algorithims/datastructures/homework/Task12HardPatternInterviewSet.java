package l06.algorithims.datastructures.homework;

import java.util.*;

public class Task12HardPatternInterviewSet {
    public static void main(String[] args) {
        //Build one console class with a menu of 4 algorithms:
        //1 Two Sum Sorted
        //2 Max Sum Window
        //3 Valid Parentheses
        //4 Merge Intervals
        //0 Exit
        //Route each option to its own method.
        //Keep menu in loop until user chooses exit.
        //Print time complexity line for the selected algorithm.
        //Handle invalid menu inputs gracefully.
        String choice = "";
        Scanner input = new Scanner(System.in);
        while (!choice.equals("0")) {
            System.out.println("Enter choice:");
            System.out.println("1. Two Sum Sorted\n2. Max Sum Window\n3. Valid Parentheses\n4. Merge Intervals\n0. Exit");
            choice = input.nextLine().strip();
            switch (choice) {
            case "0":
                System.out.println("Exiting ...");
                break;
            case "1":
                twoSumSortedArray();
                break;
            case "2":
                maxSumWindow();
                break;
            case "3":
                validParentheses();
                break;
            case "4":
                mergeIntervals();
                break;
            default:
                System.out.println("Invalid choice");

            }
        }
    }

    private static void validParentheses() {
        String s = "()[]{}";
        System.out.println("Valid Parentheses: " + s);
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        for (char ch : s.toCharArray()) {
            if (ch == '('){
                stack.push(')');
            }else if(ch == '[') {
                stack.push(']');
            }else if(ch == '{') {
                stack.push('}');
            }else if(stack.isEmpty() || stack.pop() != ch) {
                valid = false;
                break;
            }
        }
        System.out.println("Valid: " + valid);
        System.out.println("Time Complexity: O(n)");
    }

    private static void maxSumWindow() {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Array: " + Arrays.toString(nums) + " K: " + k);
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for (int i = 1; i <= nums.length - k; i++) {
            windowSum -= nums[i - 1];
            windowSum += nums[i + k - 1];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }

    private static void twoSumSortedArray() {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        System.out.println("Array: " + Arrays.toString(nums) + " Target: " + target);
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[left] + nums[right] == target){
                System.out.println("Target found at index: " + left + " and " + right);
            }else if (nums[left] + nums[right] < target){
                left++;
            }else if (nums[left] + nums[right] > target){
                right--;
            }
        }

    }

    private static void mergeIntervals() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.print("Array: ");
        for (int[] interval : intervals) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < currentInterval[1]){
                currentInterval[1] =  intervals[i][1];
            }else{
                currentInterval =  intervals[i];
                mergedIntervals.add(currentInterval);
            }
        }
        int[][] newArray = mergedIntervals.toArray(new int[mergedIntervals.size()][]);
        System.out.print("Merged Intervals: ");
        for (int[] ints : newArray) {
            System.out.println(Arrays.toString(ints) + " ");
        }

    }
}
