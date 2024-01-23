package 배열1.연습문제03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        System.out.printf("%d %d %d", num[2], num[4], num[9]);
    }
}
