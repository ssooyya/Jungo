package 함수2.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        day(month, day);
        sc.close();
    }
    public static void day(int month, int day){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 31 || day < 0)){
            System.out.println("BAD!");
        } else if ((month == 2) && (day > 29 || day < 0)){
            System.out.println("BAD!");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30 || day < 0)) {
            System.out.println("BAD!");
        } else if (month > 12 || day <= 0) {
            System.out.println("BAD!");
        } else System.out.println("OK!");
    }
}
