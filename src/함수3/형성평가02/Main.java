package 함수3.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
    public static void print(int n){
//        for (int i = 1; i <= n; i++) {
//            if (n % 2 == 1){
//                System.out.print(i + " ");
//            }
//            else System.out.print(i + " ");
//        }
        if(n % 2 == 1){
            print(n - 1);
        }
    }
}
