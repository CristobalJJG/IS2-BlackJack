package cristobaljjg.TypesOfCards;

import cristobaljjg.blackjack.Card;

public class Ace extends Card{

    public Ace(Suit suit){
        super(suit, 11);
    }
    
    public int getSecondValue(){
        return 1;
    }
    
    @Override
    public String toString(){
        return "Ace of " + getSuit();
    }
}
