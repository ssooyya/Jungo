package 선택제어문.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("입력받은 수중 가장 큰 수는 " + a + "입니다.");
        }else if (b > a && b > c) {
            System.out.println("입력받은 수중 가장 큰 수는 " + b + "입니다.");
        } else{
            System.out.println("입력받은 수중 가장 큰 수는 " + c + "입니다.");
        }
    }
}
