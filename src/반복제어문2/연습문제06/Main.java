package 반복제어문2.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        avg = (double) sum / 5;
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f", avg);
    }
}
