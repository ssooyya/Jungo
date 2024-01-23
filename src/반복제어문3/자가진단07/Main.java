package 반복제어문3.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 65;
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(a + " ");
                a++;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        } sc.close();
    }
}
