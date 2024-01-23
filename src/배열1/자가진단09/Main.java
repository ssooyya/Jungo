package 배열1.자가진단09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
