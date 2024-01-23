package 함수1.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                a[i][j] = sc.nextInt();
                a[i][3] += a[i][j];
                a[3][j] += a[i][j];
                a[3][3] += a[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
