package 반복제어문2.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = a; j <= column * a ; j += a) {
                System.out.print(j + " ");
            }
            a++;
            System.out.println();
        }
    }
}
