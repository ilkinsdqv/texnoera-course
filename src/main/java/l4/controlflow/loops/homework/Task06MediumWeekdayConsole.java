package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task06MediumWeekdayConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        int validDayLookups = 0;
        while(choice != 0) {
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting ...");
                    System.out.println("Valid day lookups: " + validDayLookups);
                    sc.close();
                    break;
                case 1:
                    System.out.printf("%d. day of the week is Monday.%n", choice);
                    validDayLookups++;
                    break;
                case 2:
                    System.out.printf("%d. day of the week is Tuesday.%n", choice);
                    validDayLookups++;
                    break;
                case 3:
                    System.out.printf("%d. day of the week is Wednesday.%n", choice);
                    validDayLookups++;
                    break;
                case 4:
                    System.out.printf("%d. day of the week is Thursday.%n", choice);
                    validDayLookups++;
                    break;
                case 5:
                    System.out.printf("%d. day of the week is Friday.%n", choice);
                    validDayLookups++;
                    break;
                case 6:
                    System.out.printf("%d. day of the week is Saturday.%n", choice);
                    validDayLookups++;
                    break;
                case 7:
                    System.out.printf("%d. day of the week is Sunday.%n", choice);
                    validDayLookups++;
                    break;
                default:
                    System.out.println("Invalid input. (Valid inputs -> 0 (EXIT), 1,2,3,4,5,6,7)");
                    break;
            }
        }
    }
}
