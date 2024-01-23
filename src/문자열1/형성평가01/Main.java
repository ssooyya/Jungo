package 문자열1.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alp1 = sc.next().charAt(0);
        char alp2 = sc.next().charAt(0);

        int sum = 0, sub = 0;

        sum = (int)alp1+alp2;
        if (alp1 > alp2) {
            sub = (int)alp1 - alp2;
        } else
            sub = (int)alp2 - alp1;
        System.out.printf("%d %d", sum, sub);
        sc.close();
    }
}
