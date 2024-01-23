package 배열2.연습문제01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (num[i] <= 0 || num[i] > 10) {
                break;
            }
            count++;
        }
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 10; j++) {
                if (num[i] < num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.println(num[i] + " : " + count + "개");
        }
    }
}
