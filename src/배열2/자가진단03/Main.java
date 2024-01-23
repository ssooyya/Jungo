package 배열2.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        num[0] = 100;   //첫번째 값 100
        int i = 2;//세번째부터 시작
        int number = sc.nextInt();  //입력받을 수
        num[1] = number;    //두번째에 입력받은 값 대입
        while (true) {
            num[i] = num[i - 2] - num[i - 1];   //전전항 - 전항
            if (num[i] < 0) break;  //음수면 종료
            i++;
        }
        for (int j = 0; j < i + 1; j++) {
            System.out.print (num[j] + " ");
        }
        sc.close();
    }
}