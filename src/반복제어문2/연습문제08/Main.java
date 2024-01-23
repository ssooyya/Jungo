package 반복제어문2.연습문제08;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 5 ; j++) {
                System.out.printf("%d * %d = %2d   ", j, i, j * i);
            }
            System.out.println();
        }
    }
}
