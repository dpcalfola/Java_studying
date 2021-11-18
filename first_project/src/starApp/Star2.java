package starApp;

public class Star2 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = n-1; j - i > 0; j--) {
                System.out.print(".");
            }


            for (int j = 0; j <= 2*i; j++) {
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
