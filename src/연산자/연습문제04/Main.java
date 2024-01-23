package 연산자.연습문제04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = ++a;
        int b1 = b--;
        int c = a + b1;
        System.out.println("a = " + a1 +", b = " + b-- + ", c = " + c);
    }
}
