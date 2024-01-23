package 연산자.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (a!=0&&b!=0)?1:0;
        int result2  = (a!=0 || b!=0)?1:0;

        System.out.printf("%d %d",result,result2);
        sc.close();
    }
}
