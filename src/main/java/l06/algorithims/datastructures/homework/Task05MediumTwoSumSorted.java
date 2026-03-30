package l06.algorithims.datastructures.homework;

public class Task05MediumTwoSumSorted {
    public static void main(String[] args) {
        //Use a sorted integer array and a target sum.
        //Implement two-pointers solution (left, right).
        //Print indices and values if a pair exists.
        //Print No pair found otherwise.
        //Add method findPair(int[] arr, int target).
        int[] sortedArray = {10,23,43,53,65,72,78,86,89,94};
        int target = 158;
        findPair(sortedArray, target);
    }

    private static void findPair(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;
        System.out.println("Target: " + target);
        while (left < right) {
            if (sortedArray[left] + sortedArray[right] == target) {
                System.out.printf("Found pair: %d. index -> %d, %d. index -> %d\n", left, sortedArray[left], right, sortedArray[right]);
                return;
            } else if (sortedArray[left] + sortedArray[right] < target) {
                left++;
            }else {
                right--;
            }
        }
        System.out.println("Pair not found");
    }
}
