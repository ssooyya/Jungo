package 반복제어문2.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = a; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
