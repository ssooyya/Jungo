package 함수2.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pow(n);
        sc.close();
    }
    public static void pow(int n){
        System.out.println((int)Math.pow(2,n));
    }
}
