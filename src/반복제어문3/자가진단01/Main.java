package 반복제어문3.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; sum < n; i+=2) {
            if (i % 2 == 1){
                sum += i;
                count++;
            }
        }System.out.printf("%d %d", count, sum);
    }
}
