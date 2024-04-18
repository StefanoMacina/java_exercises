package Collections.theory;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String faceField, int rank) {

    public enum Suit{
        CLUB, DIAMOND, HEART, SPADE;
        public char getImage(){
            return ( new char[]{9827,9830,9829,9824})[this.ordinal()];
        }
    }

    public static Card getNumericCard(Suit suit,  int cardNumber){
        if(cardNumber > 1 && cardNumber < 11) {
            return new Card(suit, String.valueOf(cardNumber), cardNumber - 2);
        }
        System.out.println("Invalid numeri card selected");
        return null;
    }

    public static Card getFaceCard(Suit suit, char abbrev){
        int charIndex = "JKQA".indexOf(abbrev);
        if(charIndex > -1){
            return new Card(suit, ""+abbrev, charIndex + 9);
        }
        System.out.println("Invalid face card selected");
        return null;
    }

    public static List<Card> getStandardDeck(){
        List<Card> deck = new ArrayList<>(52);
        for(Suit suit : Suit.values()){
            for(int i = 2; i<=10;i++){
                deck.add(getNumericCard(suit, i));
            }
            for(char c : new char[]{'J','K','Q','A'});
        }
        return deck;
    }

    public static void printDeck(List<Card> deck) {
        printDeck("current deck", deck, 4);
    }

    public static void printDeck(String description, List<Card> deck, int rows){
        if(description != null){
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for(int i = 0; i< rows; i++){
            int startedIndex = i * cardsInRow;
            int endingIndex = startedIndex + cardsInRow;
            deck.subList(startedIndex, endingIndex).forEach(c -> System.out.println(c + " "));
        }

    }

    @Override
    public String toString() {
        int index = faceField.equals("10") ? 2 : 1;
        String faceString = faceField.substring(0 ,index);
        return "%s%c(%d)".formatted(faceString,suit.getImage(),rank);
    }
}
