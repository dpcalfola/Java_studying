package myProject.card;

public class CardMain {

    public static void main(String[] args) {

        int[] newCard;

        newCard = CardMethod.makeCardArray();

        CardReader.printCardArray(newCard);


    }
}
