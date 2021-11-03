package cristobaljjg.blackjack;

import cristobaljjg.TypesOfCards.*;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    private static Deck deck;
    private List<Card> fulldeck;
    private List<Card> cardsGotten;
    
    public static Deck getDeck(){
        if(deck == null){deck = new Deck();}
        return deck;
    }
    
    public void restartDeck(){
        if(deck != null){deck = new Deck();}
    }
    
    private Deck(){
        fulldeck = new LinkedList<>();
        cardsGotten = new LinkedList<>();
        fillDeck(Suit.Clubs);
        fillDeck(Suit.Spades);
        fillDeck(Suit.Diamonds);
        fillDeck(Suit.Hearts);
    }
    
    private void fillDeck(Suit s){
        fulldeck.add(new Ace(s));
        for(int i = 2; i <= 10; i++){
            fulldeck.add(new RestOfCards(s, i));
        }
        fulldeck.add(new Jack(s));
        fulldeck.add(new Queen(s));
        fulldeck.add(new King(s));
    }   
    
    public boolean getCard(Card c){
        if(!cardsGotten.contains(c)){
            for(Card card : fulldeck){
                if(card.equals(c)){
                    int index = fulldeck.indexOf(card);
                    cardsGotten.add(fulldeck.remove(index));
                    return true;
                }
            }
        }
        return false;
    }
    
    public List<Card> getRestDeck(){
        return new LinkedList<>(fulldeck);
    }
    
    @Override
    public String toString(){
        String s = "";
        for(Card c : fulldeck){s += c.toString() + "\n";}
        return s;
    }
}
