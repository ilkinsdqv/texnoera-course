package l06.algorithims.datastructures.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task09HardMergeIntervals {
    public static void main(String[] args) {
        //Represent intervals with int[][].
        //Sort intervals by start time.
        //Merge overlapping intervals.
        //Print merged result.
        //Add method merge(int[][] intervals) returning merged intervals.
        int[][] intervals = {
                {2,6},
                {1,4},
                {8,10},
                {15,22},
                {7,13}
        };
        int[][] merged = mergeIntervals(intervals);
        for (int[] ints : merged) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < currentInterval[1]) {
                currentInterval[1] = intervals[i][1];
            }else{
                currentInterval = intervals[i];
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
