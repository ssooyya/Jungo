package 반복제어문1.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Korea\n2. USA\n3. Japan\n4. China");
            System.out.print("number? ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Seoul\n");
                    break;
                case 2:
                    System.out.println("Washington\n");
                    break;
                case 3:
                    System.out.println("Tokyo\n");
                    break;
                case 4:
                    System.out.println("Beijing\n");
                    break;
                default:
                    System.out.println("none\n");
                    sc.close();
                    return;
            }
        }
    }
}
