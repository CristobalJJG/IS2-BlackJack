package cristobaljjg.blackjack;

import cristobaljjg.TypesOfCards.*;
import static cristobaljjg.blackjack.Deck.getDeck;

public class Blackjack {
    public static void main(String[] args) {
        Deck deck = getDeck();
        boolean n = deck.getCard(new RestOfCards(Suit.Clubs, 2));
        System.out.println(n + "\n" + deck.toString());
    }
}
