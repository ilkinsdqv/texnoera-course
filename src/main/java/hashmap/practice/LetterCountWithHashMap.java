package hashmap.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCountWithHashMap {
    public static void main(String[] args) {
        //Istifadəçidən bir String alırsınız(cümlə,söz) və həmin stringdə hansı hərfdən nə qədər olduğunu print edirsiniz.
        //For example :
        //Input: "Salam"
        //Output:
        //S-1
        //a-2
        //l-1
        //m-1
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
