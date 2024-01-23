package 반복제어문1.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Base, Height;
        double width;
        char msg;

        while (true){
            System.out.print("Base = ");
            Base = sc.nextInt();
            System.out.print("Height = ");
            Height = sc.nextInt();
            width = (double) (Base * Height) / 2;
            System.out.printf("Triangle width = %.1f\n", width);

            System.out.print("Continue? ");
            msg = sc.next().charAt(0);
            if(msg =='Y' || msg =='y') {
                continue;
            }else {
                break;
            }
        } sc.close();
    }
}