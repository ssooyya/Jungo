package 선택제어문.연습문제02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        if(i1 < i2){
            System.out.println("입력받은 수 중 큰 수는 "+ i2 + "이고 작은 수는 " + i1 + "입니다.");
        }
    }
}
