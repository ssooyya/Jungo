package 반복제어문3.연습문제03;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
