package 함수1.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calc(a, b)+" "+ calc2(a, b));
        sc.close();
    }
    public static int calc(int a, int b){
        if (a > b) {
            return a / 2;
        }else{
            return a * 2;
        }
    }
    public static int calc2(int a, int b){
        if(a < b) {
            return b / 2;
        }else {
            return  b * 2;
        }
    }
}
