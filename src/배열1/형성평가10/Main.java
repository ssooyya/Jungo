package 배열1.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //20이하의 정수 n
        int[] score = new int[n];   //n명의 점수를 담을 배열
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();    //점수를 입력받아
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (score[i] < score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(score[i]);
        }
        sc.close();
    }
}
