package 배열1.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = {'J', 'U', 'N', 'G', 'O', 'L'};
        int count = 0;
        for (int i = 0; i < 6; i++) {
            char c = sc.next().charAt(0);   //문자열 한 개 입력받아
            if(c == cArr[i]){
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("none");
        }
        System.out.println(count);
        sc.close();
    }
}
