package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task02EasyDayTypeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting ...");
                    sc.close();
                    break;
                case 1:
                    System.out.printf("%d. day of the week is Monday.%n", choice);
                    break;
                case 2:
                    System.out.printf("%d. day of the week is Tuesday.%n", choice);
                    break;
                case 3:
                    System.out.printf("%d. day of the week is Wednesday.%n", choice);
                    break;
                case 4:
                    System.out.printf("%d. day of the week is Thursday.%n", choice);
                    break;
                case 5:
                    System.out.printf("%d. day of the week is Friday.%n", choice);
                    break;
                case 6:
                    System.out.printf("%d. day of the week is Saturday.%n", choice);
                    break;
                case 7:
                    System.out.printf("%d. day of the week is Sunday.%n", choice);
                    break;
                default:
                    System.out.println("Invalid input. (Valid inputs -> 0 (EXIT), 1,2,3,4,5,6,7)");
                    break;
            }
        }


    }
}
