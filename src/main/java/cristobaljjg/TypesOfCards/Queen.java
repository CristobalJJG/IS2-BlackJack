package cristobaljjg.TypesOfCards;

import cristobaljjg.blackjack.Card;

public class Queen extends Card{

    public Queen(Suit suit){
        super(suit, 10);
    }
    
    @Override
    public String toString(){
        return "Queen of " + getSuit();
    }
}
