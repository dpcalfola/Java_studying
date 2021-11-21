package arrayPractice;

import java.util.Arrays;

public class ArrayRandomExtraction {
    public static void main(String[] args) {

        int[] arr = new int[52];
        int exCount = 1 ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1 ;
        }
        //1-52까지 배열에 입력.

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }

        while (exCount <= 52){

            int randNum = (int)Math.floor(Math.random()*(53-exCount));
            //첫번째 0이상 52미만 랜덤숫자
            //두번째 0이상 51미만 랜덤숫자
            // ...
            //마지막 52번째 0이상 1미만 랜덤숫자 == 0

            System.out.println(exCount + " : " + arr[randNum]);
//            System.out.println(" randNum : " + randNum);
            arr[randNum] = 99;
            Arrays.sort(arr);
            exCount++;
        }

    }
}
