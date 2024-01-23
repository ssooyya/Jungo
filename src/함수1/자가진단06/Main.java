package 함수1.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String oper = sc.next();
        int num2 = sc.nextInt();
        int result = calc(num, oper, num2);
        System.out.printf("%d %s %d = %d", num, oper, num2, result);
        sc.close();
    }
    public static int calc(int num, String oper, int num2){
        if(oper.equals("+")){
            return num + num2;
        }else if (oper.equals("-")){
            return num - num2;
        }else if (oper.equals("*")){
            return num * num2;
        }else if (oper.equals("/")){
            return num / num2;
        }else return 0;
    }
}
