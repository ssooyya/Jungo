package 함수1.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt(); //반지름
        width(rad);
        sc.close();
    }
    public static void width(int rad){
        double width = rad * rad * 3.14;
        System.out.printf("%.2f",width);
    }
}
