package 함수1.연습문제04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("두 수의 합 = " + sum(a, b));
        System.out.println("두 수의 차 = " + sub(a, b));
        sc.close();
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        if(a > b){
            return a - b;
        }return b - a;
    }
}
