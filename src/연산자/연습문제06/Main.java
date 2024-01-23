package 연산자.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = (a > b) ? 1 : 0;
        int result2 = (b >= c) ? 1 : 0;
        int result3 = (a <= b) ? 1 : 0;
        int result4 = (b < c) ? 1 : 0;
        System.out.print(result1 + " ");
        System.out.print(result2 + " ");
        System.out.print(result3 + " ");
        System.out.println(result4);
        sc.close();
    }
}
