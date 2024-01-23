package 반복제어문1.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        int countOdd = 0;
        int countEven = 0;

        while (true){
            n = sc.nextInt();
//            System.out.println(n + " ");
            if (n == 0){
                break;
            }
            if (n % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("odd : " + countOdd);
        System.out.println("even : " + countEven);
        sc.close();
    }
}