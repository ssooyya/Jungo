package 함수1.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mul(a, b));
        sc.close();

    }
    public static int mul(int a, int b){
        int n = a;
        for (int i = 1; i < b; i++) {
            n *= a;
        }
        if (b == 0) return 1;
        return n;
    }
}
