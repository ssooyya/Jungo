package 배열1.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
        int ban = sc.nextInt();
        int ban2 = sc.nextInt();
        sum = score[ban-1] + score[ban2-1];
        System.out.printf("%.1f",sum);
        sc.close();
    }
}