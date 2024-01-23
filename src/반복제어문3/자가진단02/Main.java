package 반복제어문3.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int m = 0; m < n; m++){
            for (int k = 0; k <= m; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}