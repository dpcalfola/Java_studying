package doItAlgorithm.chap01;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a : ");
        int a = scan.nextInt();
        System.out.print("b : ");
        int b = scan.nextInt();

        while (a > b) {
            System.out.println("a 보다 큰 값을 입력하세요 ");
            b = scan.nextInt();
        }

        System.out.println("b-a 는 " + (b - a) + "입니다");

    }
}
