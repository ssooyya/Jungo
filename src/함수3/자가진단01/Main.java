package 함수3.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
        sc.close();
    }
    public static void print(int num){
        if (num == 0) {
            return;
        } else {
            System.out.println("recursive");
            print(num-1);
        }
    }
}