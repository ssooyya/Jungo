package 반복제어문3.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
}
