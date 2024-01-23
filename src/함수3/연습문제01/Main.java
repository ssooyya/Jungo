package 함수3.연습문제01;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        print(9);
    }
    public static void print(int num){
        System.out.println("홍길동");
        print(num -1);
    }
}
