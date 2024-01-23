package 함수1.연습문제07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calc1(a, b);
        calc2(a, b);
        sc.close();
    }
    public static void calc1(int a, int b){
        System.out.print("첫 번째 함수 실행중 ");
        System.out.println("x = " + b + ", y = " + a);
        System.out.print("첫 번째 함수 실행후 ");
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void calc2(int a, int b){
        System.out.print("두 번째 함수 실행중 ");
        System.out.println("x = " + b + ", y = "+ a);
        System.out.print("두 번째 함수 실행후 ");
        System.out.println("a = " + b + ", b = " + a);
    }
}
