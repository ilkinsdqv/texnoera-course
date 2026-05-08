package functionalInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lambda ifadələri ilə aşağıdakı əməliyyatları yazın:
        //
        //* String-i böyük hərfə çevirmək
        //* String-i tərsinə çevirmək
        //* Boşluqları silmək
        //* String-in uzunluğunu String kimi qaytarmaq
        Scanner input = new Scanner(System.in);
        String word =  input.nextLine();
        input.close();
        StringProcessor processor = String::toUpperCase;
        System.out.println("StringProcessor processor = String::toUpperCase -> " + processor.process(word));
        StringProcessor processor2 = s -> new StringBuilder(s).reverse().toString();
        System.out.println("StringProcessor processor2 = s -> new StringBuilder(s).reverse().toString() -> " + processor2.process(word));
        StringProcessor processor3 = String::trim;
        System.out.println("StringProcessor processor3 = String::trim -> " + processor3.process(word));
        StringProcessor processor4 = s -> String.valueOf(s.length());
        System.out.println("StringProcessor processor4 = String::length -> " + processor4.process(word));
    }
}
