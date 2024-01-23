package 함수1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sub(a, b));
        sc.close();
    }
    public static int sub(int a, int b){
        if(a > b){
            return a*a -b*b;
        } else return b*b - a*a;
    }
}
