package 배열1.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = new char[10];
        for (int i = 0; i < 10; i++) {
            cArr[i] = sc.next().charAt(0);
        }
        for (int i = 9; i >=0 ; i--) {
            System.out.print(cArr[i] + " ");
        }
        sc.close();
    }
}
