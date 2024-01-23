package 함수2.연습문제07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        asc();
    }
    public static void asc(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
