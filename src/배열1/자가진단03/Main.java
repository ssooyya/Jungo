package 배열1.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = new char[10];
        for (int i = 0; i < 10; i++) {
            cArr[i] = sc.next().charAt(0);
        }
        System.out.printf("%c %c %c", cArr[0], cArr[3], cArr[6]);
    }
}
