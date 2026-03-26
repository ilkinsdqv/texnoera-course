package l5.arrays.strings.homework;

import java.util.Arrays;

public class Task02EasyOddArrayBuilder {
    public static void main(String[] args) {
        //Create an int[] of size 50.
        //Fill it with odd numbers in ascending order (1, 3, 5, ...).
        //Print full array.
        //Print first and last values.
        int[] arr = new int[50];
        int counter = 1;
        for (int i = 0; i < 50; counter++) {
            if (counter % 2 == 1) {
                arr[i] = counter;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("First value: " + arr[0]);
        System.out.println("Last value: " + arr[arr.length - 1]);
    }
}
