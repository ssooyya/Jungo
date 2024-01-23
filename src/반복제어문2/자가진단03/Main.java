package 반복제어문2.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            if ((i + 1) % 2 == 0){
                System.out.print(i + 1 + " ");
            }
        }
    }
}
