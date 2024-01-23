package 반복제어문3.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int count = 0;
        while(true){
            int num = sc.nextInt();
            if (num == 0) {break;}
            sum += num;
            count++;
            if (count == 20){break;}
        }
        avg = sum / count;
        System.out.printf("%d %d", sum, avg);
        sc.close();
    }
}
