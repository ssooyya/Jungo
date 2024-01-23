package 배열1.연습문제04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        for (int i = 1; i <= 100; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 0) {
               break;
            }
            if (i % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
