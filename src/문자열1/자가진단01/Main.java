package 문자열1.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("ASCII code =? ");
            int ascii = sc.nextInt();   //숫자를 입력받아
            if (ascii >= 33 && ascii < 128) {
                System.out.println((char) ascii);
            } else {
                break;
            }
        }sc.close();
    }
}
