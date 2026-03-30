package l5.arrays.strings.homework;

public class Task09HardStringMethodsPlayground {
    public static void main(String[] args) {
        //Start with one sample text (for example: "  Java,Arrays,Strings  ").
        //Demonstrate and print results for:
        //length, charAt, indexOf
        //substring, toUpperCase, toLowerCase
        //startsWith, endsWith, contains
        //replace, isEmpty, isBlank
        //trim and strip
        //Handle at least one invalid index case using guard if.
        String sample = "  Java,Arrays,Strings  ";
        System.out.println(sample);
        System.out.println("sample.length() -> "  + sample.length());
        System.out.println("sample.charAt(0) -> "  + sample.charAt(0));
        System.out.println("sample.indexOf('A') -> " + sample.indexOf('A'));
        System.out.println("sample.substring(8, 14) -> "  + sample.substring(8, 14));
        System.out.println("sample.toUpperCase() -> "  + sample.toUpperCase());
        System.out.println("sample.toLowerCase() -> "  + sample.toLowerCase());
        System.out.println("sample.startsWith(\"J\") -> "  + sample.startsWith("J"));
        System.out.println("sample.endsWith(\"J\") -> "  + sample.endsWith(" "));
        System.out.println("sample.contains(\"Arrays\") -> "  + sample.contains("Arrays"));
        System.out.println("sample.replace('a', 'w') -> " + sample.replace('a', 'w'));
        System.out.println("sample.isEmpty() -> "  + sample.isEmpty());
        System.out.println("sample.isBlank() -> "  + sample.isBlank());
        System.out.println("sample.trim() -> "  + sample.trim());
        System.out.println("sample.strip() -> "  + sample.strip());

        int index = 100;
        if(index < 0 || index >= sample.length()) {
            System.out.println("Index must be between 0 and " + (sample.length() - 1));
        }else {
            System.out.println("chat at " + index + ". index -> " + sample.charAt(index));
        }

    }
}
