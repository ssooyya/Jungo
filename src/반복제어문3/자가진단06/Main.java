package 반복제어문3.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 65;
        for (int i = 0; i < n; i++) {
            for (char j = 0; j < n-i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}
