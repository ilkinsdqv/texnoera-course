package l5.arrays.strings.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task07MediumStudent3DAnalyzer {
    public static void main(String[] args) {
        //Model marks in a int[][][] array (students x subjects x semesters).
        //Print all data in readable format.
        //Compute average per student.
        //Compute best subject per student (highest average).
        //Keep logic in separate methods.
        int totalStudents = 5;
        int totalSubjects = 5;
        int totalSemesters = 5;
        Random rand = new Random();
        int[][][] students = new int[totalStudents][totalSubjects][totalSemesters];

        for (int i = 0; i < totalStudents; i++) {
            for (int j = 0; j < totalSubjects; j++) {
                for (int k = 0; k < totalSemesters; k++) {
                    students[i][j][k] = rand.nextInt(50) + 50;
                }
            }
        }

        printAllStudentData(students);
    }

    static int average(int[][] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                sum += students[i][j];
            }
        }
        return sum / (students[0].length*students[0].length);
    }

    static int averageForSubject(int[] subjects){
        return Arrays.stream(subjects).sum()/subjects.length;
    }

    static int highestAverage(int[][] students){
        int avgSubject;
        int highestAverage = 0;
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
                avgSubject = averageForSubject(students[i]);
                if (avgSubject > highestAverage) {
                    highestAverage = avgSubject;
                }
        }
        return highestAverage;
    }

    static void printAllStudentData(int[][][] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < students[i].length; j++) {
                for (int k = 0; k < students[i][j].length; k++) {
                    System.out.print(students[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("Average for  student " + (i + 1) + ": "  + average(students[i]));
            System.out.println("Higest average for  student " + (i + 1) + ": "+ highestAverage(students[i]));
            System.out.println("*****************************************************************************");
        }
    }
}
