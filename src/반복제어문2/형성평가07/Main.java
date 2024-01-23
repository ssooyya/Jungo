package 반복제어문2.형성평가07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i <= a * 10; i+=a) {
            System.out.print(i + " ");
        }
    }
}
