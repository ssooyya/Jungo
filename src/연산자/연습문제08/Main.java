package 연산자.연습문제08;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        int result1 = (a >= 1 && b >= 2) ? 0 : 1;
        int result2 = (a >= 1 || b >= 1) ? 1 : 0;
        int result3 = (b >= 1 && c >= 1) ? 0 : 1;
        int result4 = (a >= 1) ? 0 : 1;

        System.out.printf("%d %d %d %d", result1, result2, result3, result4);
    }
}
