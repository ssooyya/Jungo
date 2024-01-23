package 반복제어문1.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            if(a % 3 == 0){
                int b = a / 3;
                System.out.println(b);
            }
            if( a == -1){break;}
        }sc.close();
    }
}
