package 배열1.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
