package 반복제어문2.연습문제07;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
