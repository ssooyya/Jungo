package 배열2.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
//        int count = 0;
        while (true){
            int number = sc.nextInt();  //입력받는 수
            if (number == 0) break;
            int ten = number/10;        //십의 자리
            num[ten]++;
        }
        for (int i = 0; i <num.length; i++) {
            if (num[i] != 0)
                System.out.println(i + " : " + num[i]);
        }
        sc.close();
    }
}
