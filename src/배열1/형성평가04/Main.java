package 배열1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[100];
        int i;
        for (i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] == -1) {
                break;
            }
            //출력 시작할 index는 둘 중 하나다
            //n-3 or 0;
            int startIndex = (i - 3 >= 0) ? i - 3 : 0;
            for (int n = startIndex; n < i; n++) {
                System.out.print(num[n] + " ");
            }
            System.out.println();

        }sc.close();
    }
}