package 반복제어문2.형성평가10;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            for (int i = 1; i<=9 ; i++) {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i<=9 ; i++) {
                for (int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        }sc.close();
    }
}
