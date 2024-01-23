package 연산자.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = a++;
        int b1 = --b;
        System.out.printf("%d %d %d",a, b1, a1 * b1);
    }
}
