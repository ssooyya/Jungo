package 배열1.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        double sum2 = 0.0;
        double avg = 0.0;
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (i % 2 == 1){sum += num[i];}
            else { sum2 += num[i];
                avg = sum2 / 5;}
        }
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
        sc.close();
    }
}
