package cristobaljjg.TypesOfCards;

import cristobaljjg.blackjack.Card;

public class Jack extends Card{

    public Jack(Suit suit){
        super(suit, 10);
    }
    
    @Override
    public String toString(){
        return "Jack of " + getSuit();
    }
}
