package myProject.card;

public class CardReader {

    public static String cardReader(int n){

        int cardNum = n%13 ;
        int cardKindNum = n/13 ;

        String[] arrCardKind = {"Spades", "Diamonds", "Hearts", "clubs" };



        String result = String.valueOf(cardNum) + arrCardKind[cardKindNum] ;


        return result ;

    }


}
