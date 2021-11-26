package myProject.card;

public class CardMethod {

    public static int[] makeCardArray(){

        int[] arr = new int[52];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1 ;
        }
        return arr ;
    }
}
