package 반복제어문2.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        double avg = (double) sum / n;

        while (i < n){
            sum += sc.nextInt();
            i++;
        }
        System.out.printf("%.2f", avg);

        sc.close();
    }
}