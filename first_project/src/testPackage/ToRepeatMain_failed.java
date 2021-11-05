package testPackage;

import java.util.Scanner;

public class ToRepeatMain_failed {
    static boolean mainWhileA = true;

    public static void main(String[] args) {

        while (mainWhileA) {
            System.out.print("If you want to end program, input chracter Q: ");
            String checkQ;
            Scanner scan = new Scanner(System.in);
            checkQ = scan.next();
            scan.close();

            System.out.println(checkQ);

            if (checkQ.equals("Q")) {
                System.out.println("Program is gonna be ended");
                mainWhileA = false;

            } else {
                mainWhileA = true;
            }

        }


        System.out.println("\r< Program is ended >");
    }

}
