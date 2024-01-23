package 함수1.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n);
        sc.close();
    }
    public static void rec(int n){
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
