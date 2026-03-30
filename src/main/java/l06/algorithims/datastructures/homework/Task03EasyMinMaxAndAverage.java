package l06.algorithims.datastructures.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task03EasyMinMaxAndAverage {
    public static void main(String[] args) {
        //Use an integer array of student points.
        //Compute:
        //minimum
        //maximum
        //average
        //Keep each operation in separate methods.
        //Print a one-line summary using printf.
        int[] points = {98, 57, 78, 75, 87};
        int min = minPoint(points);
        int max = maxPoint(points);
        int average = averagePoint(points);
        System.out.printf("Points: %s -> min = %d, max = %d, average = %d\n",Arrays.toString(points), min, max, average);
    }

    private static int averagePoint(int[] points) {
        return Arrays.stream(points).sum()/points.length;
    }

    private static int maxPoint(int[] points) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i] > max) {
                max = points[i];
            }
        }
        return max;
    }

    private static int minPoint(int[] points) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i] < min) {
                min = points[i];
            }
        }
        return min;
    }
}
