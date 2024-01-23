package 배열2.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4];

        int sum;
        int avg;
        int count=0;

        for (int i = 0; i < arr.length; i++){   //5명의 학생
//            System.out.print(i+1 +"학생 ");
            for (int j = 0; j < arr[i].length; j++){    //4과목
                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < arr.length; i++){
            sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }

            avg = sum / arr[i].length;

            if(avg >= 80){
                System.out.println("pass");
                count++;
            } else{
                System.out.println("fail");
            }
        }
        System.out.println("Successful : " + count);

        sc.close();
    }
}
