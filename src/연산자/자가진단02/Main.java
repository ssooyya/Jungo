package 연산자.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int a1 = a + 100;
        int b1 = b % 10;
        System.out.printf("%d %d", a1, b1);
    }
}
