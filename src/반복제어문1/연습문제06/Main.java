package 반복제어문1.연습문제06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice){
                case 1:
                    System.out.println("입력하기를 선택하였습니다.\n");
                    break;
                case 2:
                    System.out.println("출력하기를 선택하였습니다.\n");
                    break;
                case 3:
                    System.out.println("삭제하기를 선택하였습니다.\n");
                    break;
                case 4:
                    System.out.println("끝내기를 선택하였습니다.\n");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못 입력하였습니다.\n");
                    break;
            }
        }
    }
}
