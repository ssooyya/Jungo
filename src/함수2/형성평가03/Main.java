package 함수2.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            int b = Math.abs(a[i]);
            sum += b;
        }sc.close();
        return sum;
    }
}
