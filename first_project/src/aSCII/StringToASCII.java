package aSCII;

import java.util.Scanner;

public class StringToASCII {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String c = scan.next();

        int a = c.charAt(0);

        System.out.println(a);
    }
}
