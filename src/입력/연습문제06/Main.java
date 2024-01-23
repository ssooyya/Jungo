package 입력.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 나이는 몇 살입니까? ");
        int age = sc.nextInt();
        System.out.println("당신의 나이는 " + age + "살이군요.");
    }
}
