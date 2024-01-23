package 함수2.연습문제02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3과목의 점수를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        score(a, b, c);
        sc.close();
    }
    public static void score(int a, int b, int c){
        double avg = (a + b + c) / 3;
        if(avg < 60 || a < 40 || b < 40 || c < 40){
            System.out.println("죄송합니다. 불합격입니다.");
        } else System.out.println("축하합니다. 합격입니다.");
    }
}
