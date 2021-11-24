package doItAlgorithm.chap01;

import java.util.Scanner;

public class GaussAdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("n1 과 n2 사이의 모든 정수를 더합니다.");

        System.out.print("n1 : ");
        int n1 = scan.nextInt();
        System.out.print("n2 : ");
        int n2 = scan.nextInt();


        System.out.println(gaussAdd(n1, n2));

    }

    public static int gaussAdd(int n1, int n2) {

        int result;

        if ((n1 + n2) % 2 == 0) {
            // 홀수개
            result = oddAdd(n1, n2);
        } else {
            // 짝수개
            result = evenAdd(n1, n2);

        }

        return result;


    }

    public static int oddAdd(int n1, int n2) {

        int N = n2 - n1 + 1;
        int nDivideTwo = N / 2;
        double sum = ((n1 + n2) * nDivideTwo) + (n1 + n2) / 2;
        return (int) sum;


    }

    public static int evenAdd(int n1, int n2) {

        int N = n2 - n1 + 1;
        double sum = (n1 + n2) * N / 2;
        return (int) sum;

    }
}
