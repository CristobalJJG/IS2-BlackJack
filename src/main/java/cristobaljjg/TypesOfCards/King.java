package cristobaljjg.TypesOfCards;

import cristobaljjg.blackjack.Card;

public class King extends Card{

    public King(Suit suit){
        super(suit, 10);
    }
    
    @Override
    public String toString(){
        return "King of " + getSuit();
    }
}
