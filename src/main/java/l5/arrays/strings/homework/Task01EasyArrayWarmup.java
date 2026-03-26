package l5.arrays.strings.homework;

import java.util.Arrays;

public class Task01EasyArrayWarmup {
    public static void main(String[] args) {
        //Create an int[] of size 10.
        //Set index 0 to 5 and index 9 to 99.
        //Print full array with Arrays.toString.
        //Print each index-value pair using a loop.

        int[] arr = new int[10];
        arr[0] = 5;
        arr[9] = 99;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+". index: " + arr[i]);
        }
    }
}
