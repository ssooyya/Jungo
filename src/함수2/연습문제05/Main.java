package 함수2.연습문제05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rad = sc.nextInt();
        round(rad);
        sc.close();
    }
    public static void round(int rad){
        double width = rad * rad * 3.14;
        System.out.printf("버림 : %f", width);
    }
}
