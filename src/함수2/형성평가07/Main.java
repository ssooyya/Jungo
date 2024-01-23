package 함수2.형성평가07;

import java.util.Scanner;

public class Main {
    final static double ratio = 3.141592;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("radius : ");
        double rad = sc.nextDouble();
        area(rad);
        sc.close();
    }
    public static void area(double rad){
        double area = rad * rad * ratio;
        System.out.printf("area = %.3f", area);
    }
}
