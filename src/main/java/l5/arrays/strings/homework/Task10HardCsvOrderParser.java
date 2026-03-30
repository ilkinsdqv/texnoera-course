package l5.arrays.strings.homework;

import java.util.Arrays;

public class Task10HardCsvOrderParser {
    public static void main(String[] args) {
        //Use input string like: "apple:2,banana:5,orange:3".
        //Split by comma, then split each entry by colon.
        //Store item names into String[] and quantities into int[].
        //Calculate total quantity.
        //Print summary line using String.format or .formatted.
        String input = "apple:2,banana:5,orange:3";
        String[] splitByComma = input.split(",");
        String[] names = new String[splitByComma.length];
        int[] quantities =  new int[splitByComma.length];
        for (int i = 0; i < splitByComma.length; i++) {
            names[i] = splitByComma[i].split(":")[0];
            quantities[i] = Integer.parseInt(splitByComma[i].split(":")[1]);
        }
        int totalQuantity = Arrays.stream(quantities).sum();
        String result = "Names array : %s%nQuantities array : %s%nTotal quantity : %d".formatted(Arrays.toString(names), Arrays.toString(quantities), totalQuantity);
        System.out.println(result);
    }
}
