package cristobaljjg.blackjack;

import cristobaljjg.TypesOfCards.Suit;

public abstract class Card {
    private final int value;
    private final Suit suit;
    
    public Card(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public Suit getSuit(){
        return suit;
    }
    
    public String toString(){
        return value + " of " + suit.toString();
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Card){
            Card aux = (Card) o;
            return ((getValue() == aux.getValue()) && (getSuit() == aux.getSuit()));
        }
        return false;
    }
}
