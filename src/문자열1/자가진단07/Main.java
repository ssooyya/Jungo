package 문자열1.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = new char[100];
        for (int i = 0; i < str.length(); i++) {
            c[i] =  str.charAt(i);
//            if (c[i] >='A' && c[i] <= 'Z')

        }

        System.out.println(str);
    }
}
