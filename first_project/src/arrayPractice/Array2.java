package arrayPractice;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many column do you need in array? : ");
        int columnNum = scan.nextInt();
        Integer[] array1 = new Integer[columnNum];
        //*** ?: What is the difference between int and Integer???? ***///

        System.out.print("\n");

        for (int i = 0; i < columnNum; i++) {
            array1[i] = (int) (Math.random() * 100);
            System.out.println(i + " : " + array1[i]);


        }

        System.out.println("\n\n Sort in ascending order\n");
        Arrays.sort(array1);

        for (int i = 0; i < columnNum; i++) {
            System.out.println(i + " : " + array1[i]);
        }

        System.out.println("\n\n Sort in descending order\n");

        for (int i = array1.length-1; i >= 0 ; i--) {
            System.out.println(i + " : " + array1[i]);
        }

    }
}
