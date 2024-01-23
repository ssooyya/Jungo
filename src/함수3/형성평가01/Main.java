package 함수3.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if (n < 1) return;
        print(n / 2);
        System.out.print(n + " ");
    }
}
