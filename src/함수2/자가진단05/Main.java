package 함수2.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[3];
        double max;
        double min;
        double middle;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        max = arr[0];
        min = arr[0];
        middle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            if(middle != min && middle != max){
                middle = arr[i];
            }
        }
        System.out.print((int)Math.ceil(max) + " ");
        System.out.print((int)Math.floor(min) + " ");
        System.out.print((int)Math.round(middle) + " ");
    }
}