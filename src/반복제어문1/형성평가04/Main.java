package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int count = 0;

        while (true){
            n = sc.nextInt();
            if (n == 0){
                break;
            }
            if(n % 3 != 0 && n % 5 != 0){
                count++;
            }
        }System.out.println(count);
    }
}