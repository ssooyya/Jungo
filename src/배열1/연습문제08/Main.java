package 배열1.연습문제08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < 10; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
            avg = sum / score.length;
        }
        System.out.println("총점 = " + sum);
        System.out.printf("평균 = %.1f", avg);
        sc.close();
    }
}
