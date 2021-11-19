package arrayPractice;

import java.sql.Array;
import java.util.Arrays;

public class ArrayInitialization {

    public static void main(String[] args) {
        int[] arrInt = new int[5];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) Math.floor(Math.random() * 100);
        }
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        Arrays.fill(arrInt, 0); //  배열 안의 모든 데이터를 0으로 초기화

        System.out.println("\nAfter Initialization\n");

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

//        Arrays.sort();



    }
}
