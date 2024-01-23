package 선택제어문.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char eng = sc.next().charAt(0);

        if(eng == 'A'){
            System.out.println("Excellent");
        } else if (eng == 'B') {
            System.out.println("Good");
        } else if (eng == 'C') {
            System.out.println("Usually");
        } else if (eng == 'D') {
            System.out.println("Effort");
        } else if (eng == 'F'){
            System.out.println("Failure");
        } else {
            System.out.println("error");
        }
    }
}