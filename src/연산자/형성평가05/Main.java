package 연산자.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();

        int height2 = sc.nextInt();
        int weight2 = sc.nextInt();
        int result = (height > height2 && weight > weight2) ? 1 : 0;

        System.out.println(result);
        sc.close();
    }
}
