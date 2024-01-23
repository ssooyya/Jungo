package 입력.연습문제04;

public class Main {
    public static void main(String[] args) {
        int rad = 5;
        double PI = 3.14;
        double won = rad * 2 * PI;
        double width = rad * rad * PI;
        System.out.printf("원주 = %d * %d * %f = %f\n", rad, 2, PI, won);
        System.out.printf("넓이 = %d * %d * %f = %f", rad, rad, PI, width);
    }
}
