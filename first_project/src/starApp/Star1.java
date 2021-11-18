package starApp;

import java.util.Scanner;

public class Star1 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);

        int n = 5 ;

        for (int i = 0 ; i < n ; i++){
            for ( int j = n ; j-i > 0 ; j--){
                System.out.print(".");
            }
            for ( int j = 0 ; j<=2*i ; j++){
                System.out.print("*");

            }
            System.out.println();
        }



    }
}


//   *     1 3 5 7 9    / 3 2 1 0
//  ***
// *****
//*******
