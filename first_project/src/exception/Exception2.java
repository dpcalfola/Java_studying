package exception;

import java.lang.reflect.Array;

public class Exception2 {

    public static void main(String[] args) {

        int[] score = {10, 20, 30};
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);


        try {
            System.out.println(score[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Array is empty ");
//            e.printStackTrace();
        }


        System.out.println(score[2]);

        int a = score.length;
        int b = arrayLength(score);

        System.out.println("Array.length is " + a);
        System.out.println(b);


        ProgramEndMassage();


    }

    private static int arrayLength(int[] A) {
        return A.length;
    }


    private static void ProgramEndMassage() {
        System.out.println("\n<Program is Ended>");
    }
}
