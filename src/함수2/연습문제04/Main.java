package 함수2.연습문제04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정사각형의 넓이 : ");
        int area = sc.nextInt();
        System.out.printf("정사각형의 한 변의 길이 : %f\n",rec(area));
        System.out.print("밑과 지수 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%f의 %f승은 %f입니다.", (double)a, (double)b, expo(a, b));
        sc.close();
    }
    public static double rec(int area){
        return Math.sqrt(area);
    }
    public static double expo(int a, int b){
        return Math.pow(a, b);
    }
}
