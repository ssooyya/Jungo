package 반복제어문2.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < a; i++) {
            if ((i + 1) % 5 == 0) {
                sum +=(i + 1);
            }
        }
        System.out.println(sum);
    }
}
