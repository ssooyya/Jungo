package 배열1.연습문제02;

public class Main {
    public static void main(String[] args) {
        int [] cArr = new int[26];
        for (int i = 0; i < 26; i++) {
            cArr[i] =  'A' + i;
        }
        for (int i = 25; i >= 0 ; i--) {
            System.out.print((char) cArr[i] + " ");
        }
        System.out.println();
    }
}