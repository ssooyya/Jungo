package 함수1.연습문제05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세과목의 점수를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("평균 : %.2f" ,avg(a, b, c));
        sc.close();
    }
    public static double avg(int a, int b, int c){
        return (a + b + c) / 3;
    }
}
