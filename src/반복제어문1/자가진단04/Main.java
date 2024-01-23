package 반복제어문1.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int sum = 0;
        double avg = 0.0;
        while(true){
            int a = sc.nextInt();
            sum += a;
            n++;
            avg = (double) sum / n;

            if (a >= 100){
                System.out.println(sum);
                System.out.printf("%.1f", avg);
                break;
            }
        }sc.close();
    }
}
