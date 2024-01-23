package 배열1.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 0){
                for (int j = 1; j <= i; j++) {
                    System.out.print(num[i-j] + " ");
                }
                break;
            }
        }
    }
}
