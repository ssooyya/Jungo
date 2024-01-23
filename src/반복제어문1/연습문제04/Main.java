package 반복제어문1.연습문제04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        double avg = 0.0;
        while (true){
            int a = sc.nextInt();

            sum += a;
            avg = (double) sum / n;
            n++;
            if (a == 0){
                n--;
                System.out.println("입력된 자료의 개수 = " + n);
                System.out.println("입력된 자료의 합계 = " + sum);
                System.out.printf("입력된 자료의 평균 = %.2f", avg);
                break;
            }
        } sc.close();
    }
}
