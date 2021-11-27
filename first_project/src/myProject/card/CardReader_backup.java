package myProject.card;

public class CardReader_backup {


    // 정수형 카드 넘버를 넣으면 문자형으로 출력
    public static String cardDecoder(int n) {

        int cardNum = n % 13 + 1;
        int cardKindNum = n / 13;

        String[] arrCardKind = {"Spades", "Diamonds", "Hearts", "clubs"};


        String result = String.valueOf(cardNum) + " " + arrCardKind[cardKindNum];


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
