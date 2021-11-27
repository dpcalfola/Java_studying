package myProject.card;

public class CardReader {


    // 정수형 카드 넘버를 넣으면 문자형으로 출력
    public static String cardDecoder(int n) {
        // Data of Card
        //----------------- WARNING ----- CardNum : 1-13 ----- WARNING ----------------//
        int cardNum = n % 13;
        int cardKindNum = n / 13;
        //-----------------------------------------------------------------------------//


        //------------------ Card Number Decoding start ------------------------------ //
        // cardNum Decoding : A, j, Q, K //

        String[] DecodedCardNumStr = new String[13];   // index of DecodedCardNumStr : 0 - 12

        if (cardNum == 0) {
            DecodedCardNumStr[0] = "A";
        } else if (cardNum == 10) {
            DecodedCardNumStr[10] = "J";
        } else if (cardNum == 11) {
            DecodedCardNumStr[11] = "Q";
        } else if (cardNum == 12) {
            DecodedCardNumStr[12] = "K";
        } else {
            for (int i = 1; i < 11; i++) {
                DecodedCardNumStr[i] = String.valueOf(cardNum);
            }
        }

        //------------------ Card Number Decoding ended ------------------------------ //


        // Kind of card
        String[] arrCardKind = {"Spades", "Diamonds", "Hearts", "clubs"};
        //


        //
        //
        String result = DecodedCardNumStr[cardNum] + " " + arrCardKind[cardKindNum];


        return result;

    }

    // 정수 배열 카드를 문자형을 읽어 모두 출력
    public static void printCardArray(int[] cardArr) {

        String[] arrStr = new String[cardArr.length];


        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = cardDecoder(cardArr[i]);    // error : cardArr[51]

        }

        for (int i = 0; i < arrStr.length; i++) { // it works
            System.out.println(arrStr[i]);

        }


    }


}
