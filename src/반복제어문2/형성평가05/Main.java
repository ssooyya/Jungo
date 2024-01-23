package 반복제어문2.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0){
                count1++;
            } else count2++;
        }
        System.out.println("even : " + count1);
        System.out.println("odd : " + count2);
    }
}
