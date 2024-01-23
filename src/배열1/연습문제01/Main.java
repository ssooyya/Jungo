package 배열1.연습문제01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            b[i] = a;
            System.out.print(b[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
