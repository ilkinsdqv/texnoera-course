package hashmap.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //İstifadəçidən (və ya əvvəlcədən verilmiş array-dən) 5 ədəd integer qəbul edin.
        //Bu ədədləri bir HashMap-ə aşağıdakı qaydada əlavə edin:
        //
        //Key → elementin index-i (0-dan başlasın)
        //Value → array-dəki element və ya istifadəçinin daxil etdiyi element
        //Daha sonra target adlı bir ədəd verilir.
        //Sizin məqsədiniz:
        //
        //👉 Map-də elə iki fərqli element tapmaqdır ki, onların cəmi target-ə bərabər olsun.
        //Əgər bərabərdirsə həmin key-ləri bir int arrayinə yığıb qaytarın.
        int[] arr = {4,8,20,12,7};
        Map<Integer,Integer> map = new HashMap<>();
        int index=0;
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        int target = 32;
        int[] result = findTwoSum(map, target);
        if(result != null){
            System.out.println("Two numbers found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found that sum up to the target.");
        }

    }
    public static int[] findTwoSum(Map<Integer,Integer> map,int target){
        for(Map.Entry<Integer,Integer> entry1 : map.entrySet()){
            for(Map.Entry<Integer,Integer> entry2 : map.entrySet()){
                if(entry1.getKey() != entry2.getKey() && entry1.getValue() + entry2.getValue() == target){
                    return new int[]{entry1.getKey(),entry2.getKey()};
                }
            }
        }
        return null;
    }
}
