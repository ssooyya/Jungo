package 배열1.형성평가07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int max = -1000, min = 1000;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 999){ //999입력시 종료
                break;
            }
            if (max < num[i]){  //최댓값
                max = num[i];
            }
            if(min > num[i]){   //최솟값
                min = num[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
