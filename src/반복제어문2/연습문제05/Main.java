package 반복제어문2.연습문제05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("입력받은 짝수는 " + count + "개입니다.");
    }
}
