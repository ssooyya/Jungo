package 함수2.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        System.out.printf("%.2f", round(area));
        sc.close();
    }
    public static double round(int area){
        return Math.sqrt(area/3.14);
    }
}
