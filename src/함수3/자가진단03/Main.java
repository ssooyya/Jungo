package 함수3.자가진단03;

import java.util.Scanner;

public class Main {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
        sc.close();
    }
    public static void print(int num){
        if (num == 0) {
            System.out.println(sum);
            return;
        } else {
            sum += num;
            print(num-1);
        }
    }
}
