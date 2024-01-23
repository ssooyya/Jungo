package 반복제어문2.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        double avg = 0.0;
        int count = 0;
        if (a <= b) {
            for (int i = a; i <= b ; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        } avg = (double) sum / count;
        if (a > b) {
            for (int i = b; i <= a ; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        }
        avg = (double) sum / count;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}
