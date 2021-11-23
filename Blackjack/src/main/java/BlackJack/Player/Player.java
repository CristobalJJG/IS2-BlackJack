package BlackJack.Player;

import BlackJack.Cards.Card;
import java.util.ArrayList;
import java.util.List;

public class Player {
    
    private final String name;
    private final ArrayList<Card> hand = new ArrayList<>();
    
    public Player(String name){
        this.name = name;
    }
    
    public void addCard(Card c){
        hand.add(c);
    }
    
    public void addCards(List<Card> cards){
        for (Card c : cards) {addCard(c);}
    }
    
    public List getHand(){
        return new ArrayList(hand);
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        String s = "";
        for (Card c : hand) {
            s += c.toString() + ", ";
        }
        return name + ": [" + s.substring(0, s.length()-2) + "]";
    }
}
