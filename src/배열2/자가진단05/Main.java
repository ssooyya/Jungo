package 배열2.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int[][] arr2 = new int[2][4];
        int[][] arr3 = new int[2][4];

        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr3[i][j] = arr[i][j] * arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }sc.close();
    }
}
