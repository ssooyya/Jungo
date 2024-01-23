package 배열2.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cArr = new int[26];
        for (int i = 0; i < 26; i++) {
            cArr[i] = 0;
        }
        while (true){
            char c = sc.next().charAt(0);
            if (c < 'A' || c > 'Z'){break;}
            cArr[(int)c - 65]++;
        }
        for (int i = 0; i < 26; i++) {
            if (cArr[i] != 0) {
                System.out.print((char) (int) (i + 65) + " : ");
                System.out.println(cArr[i]);
            }
        }
        sc.close();
    }
}
