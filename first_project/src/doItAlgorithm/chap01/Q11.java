package doItAlgorithm.chap01;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");

        String N = scan.next();
        scan.close();


        System.out.println("입력하신 숫자는 " + N.length() + " 자리 입니다");


    }
}
