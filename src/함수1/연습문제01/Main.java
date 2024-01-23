package 함수1.연습문제01;

public class Main {
    public static void main(String[] args) {
        line();
        System.out.println("\nline 함수를 호출하였습니다.");
        System.out.println("line 함수를 다시 호출합니다.");
        line();
    }
    public static void line(){
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
    }
}
