package 함수1.자가진단01;

import java.util.Scanner;

public class Main {
    public static void print(){
        System.out.println("~!@#$^&*()_+|");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            print();
        }
        sc.close();
    }
}
