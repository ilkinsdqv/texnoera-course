package hashmap.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstLetterWithoutRepetition {
    public static void main(String[] args) {
        //String-də ilk təkrarlanmayan hərfi tap.
        //
        //Example:
        //aabbcddee → c
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }
        map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findAny()
                .ifPresent(e -> System.out.println(e.getKey()));
    }
}
