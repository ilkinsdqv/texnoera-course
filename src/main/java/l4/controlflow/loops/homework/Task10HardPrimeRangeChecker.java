package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task10HardPrimeRangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        int primeCount = 0;
        if(startNum > endNum){
            int temp = startNum;
            startNum = endNum;
            endNum = temp;
        }
        sc.close();
        System.out.print("Prime Numbers between " + startNum + " and " + endNum + ": ");
        for(int i = startNum; i <= endNum; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
                primeCount++;
            }
        }
        System.out.println("\nPrime Numbers Count: " + primeCount);
    }

    static boolean isPrime(int n){
        int count = 1;
        for (int i = 2; i <= n; i++){
            if (n % i == 0){
                count++;
            }
            if (count > 2){
                return false;
            }
        }
        return true;
    }
}
