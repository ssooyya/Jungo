package 함수1.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max(a, b, c));
        sc.close();
    }
    public static int max(int a, int b, int c){
        int maxN = 0;
        if (a >= b && a >= c){ maxN = a;}
        if (b >= a && b >= c){ maxN = b;}
        if (c >= a && c >= b){ maxN = c;}
        return maxN;
    }
}
