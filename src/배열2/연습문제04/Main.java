package 배열2.연습문제04;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 4}, {2, 6, 7}, {8, 10, 1}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
