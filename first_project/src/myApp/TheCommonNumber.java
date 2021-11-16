package myApp;

import java.util.Scanner;

public class TheCommonNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input two numbers for finding the Greatest Common Divisor");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();


        int highCommonDivisor = 1 ;

        if (b > a) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        // always a>b

        for ( int i = 1 ; i <= b ; i++){
            if (a%i == 0 && b%i == 0){
                highCommonDivisor = i ;
            }
        }

        System.out.println();
        System.out.println("The Greatest Common Divisor of " + a + " and " + b + " is " + highCommonDivisor);

        int lowCommonMultiple = highCommonDivisor * ( a / highCommonDivisor) * (b / highCommonDivisor) ;

        System.out.println();
        System.out.println("The Lowest Common Multiple of " + a + " and " + b + " is " + lowCommonMultiple );




//        System.out.println(a +" " + b);

    }
}
