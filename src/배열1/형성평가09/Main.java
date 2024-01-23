package 배열1.형성평가09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 0) {break;}
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            if (num[i] % 2 == 1) {
                num[i] = num[i] * 2;
                System.out.printf("%d ", num[i]);
            }
            else if(num[i] % 2 == 0){
                num[i] = num[i] / 2;
                System.out.printf("%d ", num[i]);
            }
        }
        sc.close();
    }
}
