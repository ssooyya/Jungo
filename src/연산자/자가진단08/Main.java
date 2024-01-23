package 연산자.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (a > b && a > c) ? 1 : 0;
        int result2 = (a == b && b == c) ? 1 : 0;

        System.out.printf("%d %d", result, result2);
        sc.close();
    }
}