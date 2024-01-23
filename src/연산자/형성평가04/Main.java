package 연산자.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = ++a;
        int b1 = b--;
        System.out.printf("%d %d\n", a, b1);

        System.out.printf("%d %d", a, b);
    }
}
