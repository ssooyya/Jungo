package 배열1.연습문제07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num  = new int[10];
        int max = 0, min = 0;
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0){
                if (num[i] > max) {
                    max = num[i];
                }
            }else {
                if (num[i] < min){
                    min = num[i];
                }
            }
        }
        System.out.printf("%d %d", min, max);
        sc.close();
    }
}
