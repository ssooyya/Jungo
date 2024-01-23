package 반복제어문3.연습문제07;

public class Main {
    public static void main(String[] args) {
        char c = 97;
        int a = 1;
        for (int i = 0; i < 4; i++) {
            for (char j = 0; j < i + 1; j++) {
                System.out.print(c + " ");
                c++;
            }
            for (int j = 4; j > i; j--) {
                System.out.print(a + " ");
                a += 1;
            }
            System.out.println();
        }
    }
}
//a 1 2 3 4
//b c 5 6 7
//d e f 8 9
//g h i j 10