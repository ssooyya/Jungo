package 연산자.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " > " + b + " --- " + (a > b));
        System.out.println(a + " < " + b + " --- " + (a < b));
        System.out.println(a + " >= " + b + " --- " + (a >= b));
        System.out.println(a + " <= " + b + " --- " + (a <= b));
        sc.close();
    }
}
