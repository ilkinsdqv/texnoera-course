package l5.arrays.strings.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task11HardUsernameValidator {
    public static void main(String[] args) {
        //Read username from console.
        //Validate with rules:
        //length between 6 and 20
        //starts with letter
        //contains only letters, digits, _
        //cannot contain spaces
        //Use String methods (length, charAt, contains) and loop checks.
        //Print full validation report and final result (VALID or INVALID).
        String username;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: (Must start with '_', Length(6-20), Must contain only(letters, digits, _), Cannot contain spaces)");
        username = sc.nextLine();
        sc.close();
        isValid(username);
    }

    static void isValid(String username) {
        boolean valid = true;
        if(username.length() < 6 || username.length() > 20) {
            System.out.println("Length of username must be between 6 and 20 characters");
            valid = false;
        }
        if(username.charAt(0) != '_') {
            System.out.println("Username must start with '_'");
            valid = false;
        }
        if(!username.matches("^[a-zA-Z0-9_]+$")) {
            System.out.println("Username must contain only letters, digits and _");
            valid = false;
        }
        if(username.contains(" ")) {
            System.out.println("Username must not contain spaces");
            valid = false;
        }
        if(valid) {
            System.out.println("Username is valid");
        }

    }


}
