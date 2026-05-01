package generics;

import java.util.List;

public class Contains {
    //Generic method yazın: public <T> boolean contains(List<T> list, T element)
    //Verilmiş element list-də mövcuddursa true, əks halda false qaytarsın.

    public <T> boolean contains(List<T> list, T element) {
        for (T item : list) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean result = new Contains().contains(List.of(1, 2, 3, 4, 5), 3);
        System.out.println(result); // true
        boolean result2 = new Contains().contains(List.of("Salam", "Sagol"), "Necesen");
        System.out.println(result2); //false
    }
}
