package l03.variables.homework;

public class Task04EasyCharCodes {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '7';
        char ch3 = '-';
        char ch4 = '#';
        int forCh1 = (int) ch1;
        int forCh2 = (int) ch2;
        int forCh3 = (int) ch3;
        int forCh4 = (int) ch4;

        System.out.printf("For Char A: %d | For Char 7: %d | For Char -: %d | For Char #: %d %n", forCh1 , forCh2, forCh3, forCh4);

        String stringWithEmoji = "F✌️";

        System.out.printf("String Length : %d | String Code Point Count : %d%n", stringWithEmoji.length() ,  stringWithEmoji.codePointCount(0, stringWithEmoji.length()-1));

    }
}
