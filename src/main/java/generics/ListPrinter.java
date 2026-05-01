package generics;

import java.util.List;

public class ListPrinter {
    //Generic method yazın: public <T> void printList(List<T> list)
    //Verilmiş list-dəki bütün elementləri ekrana çap etsin.
    private static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("Salam", "Necesen", "Sagol");

        System.out.println("Integer List:");
        printList(intList);

        System.out.println("\nString List:");
        printList(stringList);
    }
}
