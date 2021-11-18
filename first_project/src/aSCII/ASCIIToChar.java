package aSCII;

import java.util.Scanner;

public class ASCIIToChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // 아스키 코드 입력
        char c = (char) a ;

        System.out.println(c); // 해당 문자 출력

    }
}
