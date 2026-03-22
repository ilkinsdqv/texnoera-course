package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task11HardMenuDrivenConverter {
    public static void main(String[] args) {
        //Build a looped menu:
        //1 Celsius -> Fahrenheit
        //2 Kilometer -> Mile
        //3 Manat -> USD (use a constant exchange rate)
        //0 Exit
        //Use switch for command routing.
        //Put each conversion in its own method.
        //Handle unsupported menu options without terminating the app.
        //Keep running until user chooses 0.
        int choice = -1;
        final double EXCHANGE_RATE = 0.59;
        while(choice != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "1 Celsius -> Fahrenheit\n" +
                    "2 Kilometer -> Mile\n" +
                    "3 Manat -> USD\n" +
                    "0 Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Celcius: ");
                    double  celsius = sc.nextDouble();
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius, celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter Kilometer : ");
                    double kilometer = sc.nextDouble();
                    System.out.printf("%.2f Kilometers is %.2f Miles\n", kilometer, kmToMiles(kilometer));
                    break;
                case 3:
                    System.out.println("Enter Manat: ");
                    double manat = sc.nextDouble();
                    System.out.printf("%.2f Manat is %.2f USD\n", manat, manatToUSD(manat, EXCHANGE_RATE));
                    break;
                case 0:
                    System.out.println("Thanks for using this program.\n");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice.\n");
                    break;
            }
        }
    }

    static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    static double kmToMiles(double km) {
        return km * 0.62;
    }

    static double manatToUSD(double manat, double exchangeRate) {
        return manat * exchangeRate;
    }
}
