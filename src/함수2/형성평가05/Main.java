package 함수2.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        avg();
        avg2();
    }
    public static void avg(){
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[3];
        double sum = 0;
        int avg = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        avg = (int) Math.round(sum / 3);
        System.out.println(avg);
    }
    public static void avg2(){
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[3];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextDouble();
            sum += Math.round(arr[i]);
        }
        avg = sum / 3;
        System.out.println(Math.round(avg));
    }
}
