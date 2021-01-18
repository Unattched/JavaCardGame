package Udhay.JavaCardGame;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CardMethods[] Cards = {new Bebras(), new Marco(), new JessKid(), new DevelopmentIndicatorsMan(), new BebrasMan(), new StackOverflowMan(), new BlockGameSweat(), new Crypto(), new Dream(), new Udhay()};
        CardMethods[] player1Cards = new CardMethods[3];
        CardMethods[] player2Cards = new CardMethods[3];
        CardMethods[] cardsCopy = new CardMethods[Cards.length];
        // Init player 1 cards
        System.arraycopy(Cards, 0, cardsCopy, 0, Cards.length);
        for(int i = 0; i < 3; i++) {
            int random = Utilities.getRandom(cardsCopy.length -1);
            player1Cards[i] = cardsCopy[random];
            cardsCopy = Utilities.removeIndex(cardsCopy, random);
        }
        System.arraycopy(Cards, 0, cardsCopy, 0, Cards.length);
        // Init player 2 cards
        for(int i = 0; i < 3; i++) {
            int random = Utilities.getRandom(cardsCopy.length -1);
            player2Cards[i] = cardsCopy[random];
            cardsCopy = Utilities.removeIndex(cardsCopy, random);
        }
        float player1CardsHealth = 0, player2CardsHealth = 0;
        // Get player 1 cards health
        for(CardMethods card: player1Cards) {
            player1CardsHealth += card.getHealth();
        }
        // Get player 2 cards health
        for(CardMethods card: player2Cards) {
            player2CardsHealth += card.getHealth();
        }
        System.out.println("Welcome to the best Java card game there is on the planet!");
//        while(player1CardsHealth != 0 && player2CardsHealth != 0) {
//            System.out.println("");
//        }

        
    }
}