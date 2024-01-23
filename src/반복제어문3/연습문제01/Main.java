package 반복제어문3.연습문제01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
            if (sum > a) {
                System.out.printf("%d %d", i, sum);
                break;
            }
        }
        sc.close();
    }
}
