package l5.arrays.strings.homework;

import java.util.Arrays;
import java.util.Random;

public class Task08MediumStringEqualityLab {
    public static void main(String[] args) {
        //Create strings using both literals and new String(...).
        //Print results of == and .equals(...) comparisons.
        //Apply intern() to one heap string and compare again.
        //Add short comments that explain each result.
        // 1. Literal: Created in the String Constant Pool
        String s1 = "Java";
        String s2 = "Java";

        // 2. New Keyword: Created as a new object on the Heap
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("--- Basic Comparisons ---");

        // true: s1 and s2 point to the same object in the String Pool
        System.out.println("s1 == s2: " + (s1 == s2));

        // false: s1 is in the Pool, s3 is a unique object on the Heap
        System.out.println("s1 == s3: " + (s1 == s3));

        // false: s3 and s4 are two different objects on the Heap
        System.out.println("s3 == s4: " + (s3 == s4));

        // true: .equals() checks the actual character content ("Java")
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        System.out.println("\n--- Interning Results ---");

        // 3. Apply intern(): Moves/finds the string in the Pool and returns that reference
        String s5 = s3.intern();

        // true: s5 now points to the "Java" object in the Pool (same as s1)
        System.out.println("s1 == s5: " + (s1 == s5));

        // false: s3 still points to its original Heap object
        System.out.println("s3 == s5: " + (s3 == s5));
    }
}
