package 배열2.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[3][3];
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 학생의 점수 ");
            for (int j = 0; j < 3; j++) {
                score[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("%5d국어 영어 수학 총점");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
            }
        }
    }
}
