package l5.arrays.strings.homework;

import java.util.Arrays;

public class Task03EasyAgeStats {
    public static void main(String[] args) {
        //Create an int[] with at least 8 ages.
        //Calculate and print:
        //total sum
        //integer average
        //minimum age
        //maximum age
        //Keep each calculation in a separate method.
        int[] ages = {15, 38, 27, 12, 19, 45, 28, 55};
        int totalSum  = totalSumAges(ages);
        int average = averageAges(ages);
        int minimum = minimumAge(ages);
        int maximum = maximumAge(ages);
        System.out.println("Total sum: " + totalSum);
        System.out.println("Average age: " + average);
        System.out.println("Minimum age: " + minimum);
        System.out.println("Maximum age: " + maximum);
    }

    private static int maximumAge(int[] ages) {
        return Arrays.stream(ages).max().getAsInt();
    }


    private static int minimumAge(int[] ages) {
        return Arrays.stream(ages).min().getAsInt();
    }

    private static int averageAges(int[] ages) {
        return totalSumAges(ages)/ages.length;
    }

    public static int totalSumAges(int[] ages) {
        return Arrays.stream(ages).sum();
    }
}
