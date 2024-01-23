package 반복제어문1.연습문제05_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int avg = 0;
        while (true){
            int a = sc.nextInt();
            if (a == 0) break;
            if(a % 2 == 1){
                sum += a;
                n++;
            }
        }sc.close();
        avg =  sum / n;
        System.out.println("홀수의 합 = " + sum);
        System.out.println("홀수의 평균 = " + avg);
    }
}
