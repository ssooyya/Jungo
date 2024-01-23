package 배열1.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int count = 0;  //개수
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 0){
                break;}
            if (num[i] % 5 == 0) {
                count++;
                sum += num[i];
                avg = (double) sum / count;
            }
        }
        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
        sc.close();
    }
}
