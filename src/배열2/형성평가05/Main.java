package 배열2.형성평가05;

import java.util.Scanner;
/*
1class? 15 2 35
2class? 33 1 6
3class? 5 10 19
4class? 1 8 55
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];    //4개반 x 3학생
        int[] sum = new int[4];

        //제기차기 입력
        for(int i = 0; i< arr.length; i++){ //반
            System.out.print(i + 1 + "class? ");
            for (int j = 0; j < arr[i].length; j++){ //학생
                arr[i][j] = sc.nextInt();
                sum[i] += arr[i][j];
            }
        }
        //sum
        for(int row = 0; row < sum.length; row++){
            System.out.println((row + 1) + "class : " + sum[row]);
        }
        sc.close();
    }
}
