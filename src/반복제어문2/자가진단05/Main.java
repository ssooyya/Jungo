package 반복제어문2.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int count3 = 0;
        int count5 = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 3 == 0){
                count3++;
            }
            if(a[i] % 5 == 0){
                count5++;
            }
        }
        System.out.println("Multiples of 3 : " + count3);
        System.out.println("Multiples of 5 : " + count5);
    }
}
