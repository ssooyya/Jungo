package 함수2.자가진단06;

public class Main {
    public static void main(String[] args) {
        calc();
    }
    public static void calc(){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
        }
    }
}
