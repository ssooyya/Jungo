package 배열1.연습문제09;

public class Main {
    public static void main(String[] args) {
        int[] num = {95, 75, 85, 100, 50};

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (num[i] > num[j]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
