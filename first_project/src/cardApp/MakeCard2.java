package cardApp;


public class MakeCard2 {

    static double selectedCardNum = makeCardNum();
    static double selectedCardKind = makeCardKind();

    public static void main(String[] args) {


//        System.out.println(strCardNum());
//        System.out.println(strCardKind());

        System.out.println("\nYour Card is <" + strCardNum() + " of " + strCardKind() + ">");


    }

    private static double makeCardNum() {

        return Math.floor(Math.random() * 13) + 1;

    }

    private static double makeCardKind() {
        return Math.floor(Math.random() * 4) + 1;
    }

    private static String strCardNum() {

        String returnStrCardNum = null;

        if (selectedCardNum == 1) {
            returnStrCardNum = "Ace";
        } else if (selectedCardNum == 11) {
            returnStrCardNum = "Jack";
        } else if (selectedCardNum == 12) {
            returnStrCardNum = "Queen";
        } else if (selectedCardNum == 13) {
            returnStrCardNum = "King";
        } else {
            returnStrCardNum = Integer.toString((int) selectedCardNum);
        }

//        System.out.println(selectedCardNum);

        return returnStrCardNum;

    }

    private static String strCardKind() {
        String ReturnStrCardKind;
        String[] cardArray = {"Joker", "Spades", "Hearts", "Diamonds", "Clubs"};

        ReturnStrCardKind = cardArray[(int) selectedCardKind];
        return ReturnStrCardKind;

    }
}

