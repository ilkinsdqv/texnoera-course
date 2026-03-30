package l06.algorithims.datastructures.homework;

import java.util.*;

public class Task08MediumWordFrequencyMap {
    public static void main(String[] args) {
        //Start with a sentence string.
        //Normalize text to lowercase and remove punctuation.
        //Split into words and count frequency with HashMap<String, Integer>.
        //Print all words and counts.
        //Print the most frequent word.
        String sentence = "Java is great, but is Java always better than Python? Python is powerful; however, Java remains the king of enterprise!";
        String cleanSentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = cleanSentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int maxFrequency = 0;
        List<String> frequentWord = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("Word: %-10s | Count: %d%n", entry.getKey(), entry.getValue());
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                frequentWord.clear();
                frequentWord.add(entry.getKey());
            }else if(entry.getValue() == maxFrequency){
                frequentWord.add(entry.getKey());
            }
        }
        System.out.println("************************");
        System.out.println("Most Frequent Word: ");
        for (String word : frequentWord) {
            System.out.printf("Word: %-10s | Count: %d%n", word, maxFrequency);
        }


    }
}
