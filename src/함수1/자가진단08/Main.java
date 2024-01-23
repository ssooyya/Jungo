package 함수1.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gugudan(a, b);
        sc.close();
    }
    public static void gugudan(int a, int b){
        if(a <= b){
            for (int i = a; i <= b ; i++) {
                System.out.println("== " + i + "dan ==");
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %2d\n", i, j, i * j);
                }
                System.out.println();
            }
        } else if(a >= b){
            for (int i = b; i <= a ; i++) {
                System.out.println("== " + i + "dan ==");
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %2d\n", i, j, i * j);
                }
                System.out.println();
            }
        }
    }
}
