package 함수1.연습문제08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
        mul(a, b);
        sc.close();
    }
    public static void sum(int a, int b){
        System.out.println("합 : " + (a + b));
    }
    public static void mul(int a, int b){
        System.out.println("곱 : " + (a * b));
    }
}
