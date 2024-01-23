package 반복제어문3.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  //7
        for (int i = num; i < 100; i+=num) {
            System.out.print(i + " ");
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70) {
                break;
            }
        }sc.close();
    }
}
