package 반복제어문3.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a + " ");
                a+=2;
                if(10 <= a) a = 1;
            }
            System.out.println();
        } sc.close();
    }
}
