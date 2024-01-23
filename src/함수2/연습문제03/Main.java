package 함수2.연습문제03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.printf("두 정수의 차 : %d\n", subInteger(a, b));
        System.out.printf("두 실수의 차 : %f", subDouble(c, d));
        sc.close();
    }
    public static int subInteger(int a, int b){
        if(a > b){
            return a - b;
        } else return b - a;
    }
    public static double subDouble(double c, double d){
        if(c > d){
            return c - d;
        }else return d - c;
    }
}
