package hashmap.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatedLetter {
    public static void main(String[] args) {
        //Array-də ən çox təkrarlanan elementi tap.
        //
        //Example:
        //[1,2,3,2,2,1] → 2
        int[] arr = {1,2,3,3,3,3,3,2,2,1};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey()));
    }
}
