package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStreamTasks {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Eflatun", "Teymur", "Vali", "Ali", " ", "Aysel", "Aynur", "Nigar", "Aygun", "Amin", " "));
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Scanner sc = new Scanner(System.in);
        while(true){
            int choice = sc.nextInt();
            switch (choice){
            case 1:
                //Tapşırıq 1: Liste Elementlərini Yazdırın
                //Bir `List<String>` yaradın və Stream-dan istifadə edərək bütün elementləri konsola
                //yazdırın.
                names.stream().forEach(System.out::println);
                break;
            case 2:
                //Tapşırıq 2: Çüt Elementləri Filtrlə
                //Bir `List<Integer>` yaradın və yalnız cüt elementləri seçib yazdırın.
                numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
                break;
            case 3:
                //Tapşırıq 3: Elementləri Böyük Hərfə Çevir
                //Bir `List<String>` yaradın və bütün elementləri böyük hərflərə çevirərək yazdırın.
                names.stream().forEach(n -> System.out.println(n.toUpperCase()));
                break;
            case 4:
                //Tapşırıq 4: Ədədlərin Kvadratını Tap
                //Bir `List<Integer>` yaradın və hər bir ədədin kvadratını hesablayaraq yazdırın.
                numbers.stream().forEach(n -> System.out.println(n*n));
                break;
            case 5:
                //Tapşırıq 5: Sıralama
                //Bir `List<String>` yaradın və Stream istifadə edərək elementləri əlifba sırasına görə
                //sıralayın.
                names.stream().map(String::toLowerCase).sorted().forEach(System.out::println);
                break;
            case 6:
                //Tapşırıq 6: Filtrləmə ilə String Tapma
                //Bir `List<String>` yaradın və yalnız a hərfi ilə başlayan elementləri konsola yazdırın.
                names.stream().forEach(n -> {;
                    if(n.startsWith("A") || n.startsWith("a")){
                        System.out.println(n);
                    }
                });
                break;
            case 7:
                //Tapşırıq 7: Boş Olmayan Stringləri Seç
                //Bir `List<String>` yaradın və yalnız boş olmayan elementləri seçib yazdırın.
                names.stream().filter(n -> !n.trim().isEmpty()).forEach(System.out::println);
                break;
            case 8:
                //Tapşırıq 8: Maksimal Uzunluqlu Stringi Tapın
                //Bir `List<String>` yaradın və Stream-dan istifadə edərək ən uzun stringi tapın.
                names.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).ifPresent(System.out::println);
                break;
            case 9:
                //Tapşırıq 9: Sayma
                //Bir `List<Integer>` yaradın və Stream-dan istifadə edərək cüt elementlərin sayını
                //hesablayın.
                System.out.println(numbers.stream().filter(n -> n % 2 == 0).count());
                break;
            case 10:
                //Tapşırıq 10: Stringləri Birləşdirin
                //Bir `List<String>` yaradın və bütün elementləri vergüllə ayıraraq birləşdirin (məsələn:
                //'a,b,c').
                names.stream().forEach(n -> System.out.print(n + ","));
                System.out.println();
                break;
            case 11:
                //Tapşırıq 11: Aralıqdakı Ədədləri Tapma
                //0-dan 20-yə qədər olan ədədlərdən yalnız 10-dan böyük və 15-dən kiçik olanları seçib
                //yazdırın.
                numbers.stream().filter(n -> n > 10 && n < 15).forEach(System.out::println);
                break;
            case 12:
                //Tapşırıq 12: Çoxaltma
                //Bir `List<Integer>` yaradın və bütün elementləri 2 ilə çoxaldaraq yeni bir siyahı yaradın.
                List numbersAdd2 = numbers.stream().map(n -> n + 2).toList();
                System.out.println(numbersAdd2);
                break;
            case 13:
                //Tapşırıq 13: Əks İstiqamətdə Sıralama
                //Bir `List<Integer>` yaradın və Stream istifadə edərək onu azalan sırada sıralayın.
                numbers.stream().sorted((n1, n2) -> Integer.compare(n2, n1)).forEach(System.out::println);
                break;
            case 14:
                //Tapşırıq 14: Ən Kiçik Elementi Tapma
                //Bir `List<Integer>` yaradın və ən kiçik elementi Stream vasitəsilə tapın.
                numbers.stream().min(Integer::compare).ifPresent(System.out::println);
                break;
            case 15:
                //Tapşırıq 15: Ədədlərin Hasili
                //Bir `List<Integer>` yaradın və bütün elementlərin hasilini Stream istifadə edərək
                //hesablayın.
                System.out.println(numbers.stream().reduce(1, (a, b) -> a * b));
                break;
            case 0:
                System.out.println("Exiting...");
                return;
            }
        }
    }
}
