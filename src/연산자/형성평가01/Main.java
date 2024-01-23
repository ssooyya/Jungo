package 연산자.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int com = sc.nextInt();
        int sum = 0;
        int avg = 0;

        sum = kor + eng + math + com;
        avg = sum / 4;
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
    }
}
