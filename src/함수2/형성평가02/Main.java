package 함수2.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        calc(a, b);
        sc.close();

    }
    public static void calc(double a, double b){
       int a1 = (int) Math.sqrt(a);
       int b1 =  (int) Math.sqrt(b);
       int count = 0;
       if(Math.sqrt(a) == a1 || Math.sqrt(b) == b1){
           System.out.println((int) (Math.abs(a1 - b1)) + 1);
       } else {
           System.out.println((int) (Math.abs(a1 - b1)));
       }
    }
}
