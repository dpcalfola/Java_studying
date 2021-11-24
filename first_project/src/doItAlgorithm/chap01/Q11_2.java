package doItAlgorithm.chap01;

import java.util.Scanner;

public class Q11_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int n;


        do {
            System.out.print("양의 정수를 입력하세요 : ");
            n = scan.nextInt();

        } while (n <= 0);

        int digit = 0;

        while (n > 0) {
            n /= 10;
            digit++;
        }


        System.out.println("입력하신 숫자는 " + digit + " 자리 입니다");


    }
}
