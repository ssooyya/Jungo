package 반복제어문2.자가진단08;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 5; i++) {
            for (int j = 1; j < 6 ; j++) {
                System.out.printf("%d * %d = %2d   ", i, j,i * j);
            }
            System.out.println();
        }
    }
}