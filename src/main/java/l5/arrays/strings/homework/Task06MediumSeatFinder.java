package l5.arrays.strings.homework;

import java.util.Scanner;

public class Task06MediumSeatFinder {
    public static void main(String[] args) {
        //Build a 2D String array for theater seats ("A1", "A2", ...).
        //Ask user for a seat code.
        //Search matrix and print row/column if found.
        //Print Seat not found if missing.
        //Add a boolean flag to avoid duplicate result prints.
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
                {"D1", "D2", "D3", "D4", "D5"},
        };
        boolean found = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seat code:");
        String seatCode = input.nextLine();
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seatCode.equals(seats[i][j])) {
                    System.out.printf("Seat code found: %d. row, %d. column", i+1, j+1);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Seat code not found.");
        }
    }
}
