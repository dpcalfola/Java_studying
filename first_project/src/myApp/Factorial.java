package myApp;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input number of Factorial : ");
        int num = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {

            result *= i;

        }

        System.out.println(num + "! is " + result);


    }
}
