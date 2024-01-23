package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;
        int count = 0;

        while (true){
            n = sc.nextInt();
            if(n > 100){
                break;
            } else if (n < 0){
                break;
            }
            sum += n;
            count++;
        }
        double avg = (double)sum / count;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);

        sc.close();
    }
}