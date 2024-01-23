package 함수2.형성평가01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        desc();
    }
    public static void desc(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int temp;
        if(n >= 1 || n <= 15){
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = sc.nextInt();
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
