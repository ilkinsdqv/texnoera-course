package l5.arrays.strings.homework;

import java.util.Arrays;

public class Task04EasyManualSort {
    public static void main(String[] args) {
        //Create an unsorted int[].
        //Clone the array into copy.
        //Sort only copy using bubble sort (no Arrays.sort).
        //Print original and sorted arrays to prove original was unchanged.
        int[] originalArray = new int[10];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = (int)(Math.random()*100);
        }
        int[] sortedArray = sortArray(originalArray.clone());
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    static int[] sortArray(int[] arr) {
        boolean swapped;
        int count = 0;
            for (int i = 0; i < arr.length-1; i++) {
                swapped = false;
                for (int j = 0; j < arr.length-1-i; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                    count++;
                }
                if (!swapped) break;
            }
        System.out.println(count);
        return arr;
    }
}
