package 반복제어문3.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i + 2; j++) {
                a += 1;
                System.out.print(a + " ");
            }
            System.out.println();
        }sc.close();
    }
}
