package l06.algorithims.datastructures.homework;

import java.util.Arrays;

public class Task10HardBinarySearchCapacity {
    public static void main(String[] args) {
        //Solve "minimum ship capacity within D days" style problem.
        //Use binary search over capacity range.
        //Write feasibility method canShip(int[] weights, int days, int capacity).
        //Return minimal valid capacity.
        //Print result with test dataset. ????????
        int[][] allWeights = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {3, 2, 2, 4, 1, 4},
                {1, 2, 3, 1, 1},
                {10, 10, 10, 10},
                {1, 10, 1, 1, 10},
                {4, 4, 4, 4, 4},
                {5, 1, 1, 1, 1},
                {10, 5, 2, 8, 1},
                {2, 3, 4, 5, 6, 7},
                {7, 2, 5, 10, 8}
        };
        int[] allDays = {5, 3, 4, 2, 2, 5, 1, 3, 2, 2};

        for (int i = 0; i < allWeights.length; i++) {
            int[] weights = allWeights[i];
            int day = allDays[i];
            int minCapacity = shipWithinDays(weights, day);
            System.out.println("Weights array: " + Arrays.toString(weights));
            System.out.println("Min Capacity is " + minCapacity + " for " +  day + " days");
            System.out.println("**********************************************");
        }
    }

    static boolean canShip(int[] weights, int days, int capacity){
        int currentDayCount = 1;
        int currentLoad = 0;
        for (int weight : weights) {
            if(currentLoad + weight > capacity){
                currentDayCount++;
                currentLoad = weight;
            }else{
                currentLoad += weight;
            }
        }
        return currentDayCount <= days;
    }


    static int shipWithinDays(int[] weights, int days){
        int high = 0;
        int low = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        while (low < high){
            int mid = low + (high - low)/2;
            if(canShip(weights, days, mid)){
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
}
