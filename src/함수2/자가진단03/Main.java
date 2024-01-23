package 함수2.자가진단03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println(Intger(a, b));
        System.out.printf("%.2f",Double(c, d));
        sc.close();
    }
    public static int Intger(int a, int b){
        int aa = a;
        int bb = b;
        if (a < 0){
            a = -a;
        }
        if (b < 0){
            b = -b;
        }
        if(a > b){
            return aa;
        } else  return bb;
    }
    public static double Double(double c, double d){
        double cc = c;
        double dd = d;
        if (c < 0){
            c = -c;
        }
        if (d < 0){
            d = -d;
        }
        if(c > d){
            return dd;
        } else return cc;
    }
}
