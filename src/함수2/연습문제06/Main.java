package 함수2.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("%.2f",round(r));
        sc.close();
    }
    public static double round(double r){
        return 2 * 3.14 * r;
    }
}
