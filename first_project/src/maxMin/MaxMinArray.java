package maxMin;

public class MaxMinArray {

    public static void main(String[] args) {
        int[] arr = new int[10];



        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.floor(Math.random() * 100));
        }

        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;


        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
            if(arr[i] < min ){
                min = arr[i];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println();
        System.out.println("Max is " + max);
        System.out.println("min is " + min);
    }
}
