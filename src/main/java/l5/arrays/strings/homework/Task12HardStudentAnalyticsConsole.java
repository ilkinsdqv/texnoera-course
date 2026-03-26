package l5.arrays.strings.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task12HardStudentAnalyticsConsole {
    public static void main(String[] args) {
        //Build a small console app using:
        //String[] studentNames
        //int[][] grades (student x subject)
        //Print menu:
        //1 Show all students and averages
        //2 Show top student
        //3 Search student by name
        //0 Exit
        //Use loops + methods + String comparisons (equalsIgnoreCase).
        //Keep menu running until user exits.
        String[] studentNames = {"James", "Sophia", "Ethan", "Olivia", "Liam",
                "Emma", "Noah", "Ava", "Lucas", "Mia"};
        int[][] grades = {
                {85, 70, 90, 65, 100}, // James
                {40, 55, 60, 70, 45},  // Sophia
                {90, 92, 88, 95, 85},  // Ethan
                {75, 80, 70, 85, 90},  // Olivia
                {60, 65, 70, 55, 60},  // Liam
                {100, 95, 98, 92, 99}, // Emma
                {30, 45, 50, 40, 35},  // Noah
                {88, 84, 86, 90, 82},  // Ava
                {72, 75, 78, 80, 85},  // Lucas
                {95, 90, 92, 88, 94}   // Mia
        };

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Please enter your choice: ");
            System.out.printf("1. Show all students and averages\n2. Show top student\n3. Search student by name\n0. Exit\n");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    printAllStudents(grades, studentNames);
                    break;
                case 2:
                    showTopStudent(grades, studentNames);
                    break;
                case 3:
                    System.out.println("Enter student name: ");
                    String studentName = input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentNames.length; i++) {
                        if (studentNames[i].equalsIgnoreCase(studentName)) {
                            System.out.println("Student " + studentNames[i] + " has been found!");
                            System.out.println(studentNames[i] + "`s grades:");
                            System.out.println(Arrays.toString(grades[i]));
                            System.out.printf("Average is: %d%n", Arrays.stream(grades[i]).sum()/grades[i].length);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Student " + studentName + " does not exist!");
                    }
                    break;
                case 0:
                    System.out.println("Thank You!");
                    System.out.println("Exiting ...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void showTopStudent(int[][] grades, String[] studentNames) {
        int highestAvg = Integer.MIN_VALUE;
        int average;
        int indexOfHighestAvg = 0;
        for (int i = 0; i < grades.length; i++) {
            average = Arrays.stream(grades[i]).sum()/grades[i].length;
            if(average > highestAvg) {
                highestAvg = average;
                indexOfHighestAvg = i;
            }
        }
        System.out.printf("Top Student is %s with %d average!%n", studentNames[indexOfHighestAvg], highestAvg);
    }

    static void printAllStudents(int[][] grades, String[] studentNames) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(studentNames[i] + "`s grades: ");
            System.out.println(Arrays.toString(grades[i]));
            System.out.println("**************************");
        }
    }
}
