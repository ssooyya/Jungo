package 문자열1.형성평가03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split("\\@\\.");

        System.out.println(Arrays.toString(strings));
    }
}
