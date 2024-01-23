package 함수1.연습문제02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("10큰수 : " + (num + 10));
        System.out.println("10작은수 : " + (num - 10));
        sc.close();
    }
}

