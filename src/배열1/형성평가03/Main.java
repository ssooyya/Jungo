package 배열1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sumOdd = 0;//홀수
        int sumEven = 0;//짝수
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (i % 2 == 1) {
                sumEven +=num[i];
            }else {sumOdd += num[i];}

        }
        System.out.println("odd : " + sumOdd);
        System.out.println("even : " + sumEven);
    }
}
