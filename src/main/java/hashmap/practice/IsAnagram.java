package hashmap.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        isAnagram(word1, word2);
    }

    private static void isAnagram(String word1, String word2) {
        if(word1.length() != word2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for(int i = 0; i < word1.length(); i++){
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0 ) + 1);
        }
        for(int i = 0; i < word2.length(); i++){
            if(!map.containsKey(word2.charAt(i))){
                System.out.println("Not Anagram");
                return;
            }
            map.put(word2.charAt(i), map.get(word2.charAt(i)) - 1);
            if(map.get(word2.charAt(i)) < 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
