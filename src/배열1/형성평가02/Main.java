package 배열1.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        sum = num[0] + num[2] + num[4];
        System.out.println(sum);
        sc.close();
    }
}
