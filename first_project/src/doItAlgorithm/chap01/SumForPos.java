package doItAlgorithm.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SumForPos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("1 부터 n 까지의 자연수의 합을 구합니다. ");

        int n;
        int sum = 0;


        do {
            System.out.print("n : ");
            n = Integer.parseInt(br.readLine());

        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1 부터 n 까지의 자연수의 합은 " + sum + "입니다");

    }
}
