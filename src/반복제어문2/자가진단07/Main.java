package 반복제어문2.자가진단07;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
            n -= 4;
        }
    }
}
