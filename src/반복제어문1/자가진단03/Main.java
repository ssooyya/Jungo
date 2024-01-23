package 반복제어문1.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("number? ");
            int n = sc.nextInt();
            if (n==0) break;
            if(n > 0){
                System.out.println("positive integer");
            } else System.out.println("negative number");
        }
        sc.close();
    }
}
