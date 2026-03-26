package l06.algorithims.datastructures.homework;

import java.util.Arrays;
import java.util.Random;

public class Task04EasyDuplicateCounter {
    public static void main(String[] args) {
        //Use an integer array where values are between 0 and 20.
        //Build a frequency array of size 21.
        //Print each value and its frequency if frequency > 0.
        //Print duplicate count (values appearing more than once).
        Random rand = new Random();
        int[] nums = new int[20];
        int[] freq = new int[21];
        int duplicateCount = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(21);
        }
        System.out.println(Arrays.toString(nums));
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0){
                System.out.printf("Value: %d -> Frequency: %d%n", i, freq[i]);
                if(freq[i] > 1){
                    duplicateCount++;
                }
            }
        }
        System.out.println("Duplicate Count: "+duplicateCount);
    }
}
