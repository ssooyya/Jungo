package 연산자.연습문제05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a == b) ? 1 : 0;
        int result2 = (b == c) ? 1 : 0;
        int result3 = (a != b) ? 1 : 0;
        int result4 = (b != c) ? 1 : 0;
        System.out.printf("%d %d %d %d", result, result2, result3, result4);
        sc.close();
    }
}
