package 연산자.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(true);
        }else System.out.println(false);

        if (a != b) System.out.println(true);
        else System.out.println(false);
    }
}
