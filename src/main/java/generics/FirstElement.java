package generics;

import java.util.ArrayList;
import java.util.List;

public class FirstElement {
    //Generic method yazın: public <T> T getFirst(List<T> list)
    //Verilmiş list-in ilk elementini qaytarsın. Əgər list boşdursa uyğun davranış müəyyən edin.

    private static <T> T getFirst(List<T> list) {
        if(list == null){
            System.out.println("List is null.");
            return null;
        }else{
            return list.getFirst();
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Salam", "Necesen", "Sagol");
        List<Integer> intList = new ArrayList<>();

        System.out.println("First element of stringList: \n" + getFirst(stringList));
        System.out.println("First element of intList: \n" + getFirst(intList));
    }
}
