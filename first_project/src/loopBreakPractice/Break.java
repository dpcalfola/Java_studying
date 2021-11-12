package loopBreakPractice;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            int a = scan.nextInt();

            if (a == 0) {
                System.out.println("System gonna be break");
                break;
            } else {
                System.out.println("Not break and input number is " + a);
            }


        }
        scan.close();
    }
}
