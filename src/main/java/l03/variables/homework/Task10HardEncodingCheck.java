package l03.variables.homework;

import java.nio.charset.StandardCharsets;

public class Task10HardEncodingCheck {
    public static void main(String[] args) {
        String productTitle = "Café Bakı 😀";
        byte[] toUTF_8Array = productTitle.getBytes(StandardCharsets.UTF_8);
        byte[] toISO_8859_1Array = productTitle.getBytes(StandardCharsets.ISO_8859_1);
        //Print string length(), codePointCount(...), UTF-8 byte count, and ISO-8859-1 byte count.
        //Declare two char values from the title and print their integer code values.
        System.out.printf("String length : %d | Code Point Count : %d | UTF-8 byte count : %d | ISO-8859-1 byte count : %d%n",
                productTitle.length(),productTitle.codePointCount(0, productTitle.length()) , toUTF_8Array.length, toISO_8859_1Array.length);

        char ch1 = productTitle.charAt(0);
        char ch2 = productTitle.charAt(3);
        System.out.println(ch1 + " to int : " + (int) ch1);
        System.out.println(ch2 + " to int : " + (int) ch2);
    }
}
