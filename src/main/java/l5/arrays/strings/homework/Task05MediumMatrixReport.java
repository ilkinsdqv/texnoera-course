package l5.arrays.strings.homework;

import java.util.Arrays;

public class Task05MediumMatrixReport {
    public static void main(String[] args) {
        //Create a 3 x 4 integer matrix (hardcoded values).
        //Print matrix in grid format.
        //Compute and print each row sum.
        //Compute and print each column sum.
        //Print total matrix sum.
        int[][] matrix = {
                {2,3,7,5},
                {5,8,13,2},
                {7,4,23,6},
                {9,1,10,13}
        };
        int rowSum = 0;
        int colSum1 = 0;
        int colSum2 = 0;
        int colSum3 = 0;
        int colSum4 = 0;
        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                rowSum += matrix[i][j];
            }
            colSum1 += matrix[i][0];
            colSum2 += matrix[i][1];
            colSum3 += matrix[i][2];
            colSum4 += matrix[i][3];
            totalSum += rowSum;
            System.out.print("= " + rowSum);
            rowSum = 0;
            System.out.println();
        }
        System.out.println("=\t=\t=\t=\tTotal");
        System.out.printf("%d\t%d\t%d\t%d\t %d%n", colSum1, colSum2, colSum3, colSum4, totalSum);

    }
}
