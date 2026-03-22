package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task02EasyDayTypeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();
        String weekDay = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        if(day >= 1 && day <= 7){
            System.out.printf("%d. of the week is %s%n", day, weekDay);
        }
        if(day >= 1 && day <= 5){
            System.out.printf(weekDay + " is a Weekday");
        }else if(day >= 6 && day <= 7){
            System.out.printf(weekDay + " is a Weekend");
        }
    }
}
