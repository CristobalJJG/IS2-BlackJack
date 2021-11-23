package BlackJack;

import BlackJack.Cards.*;
import BlackJack.Player.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitPlayers {
    
    Player p1, p2, p3, croupier;
    List<Card> deck;
    
    protected InitPlayers(Player p1, Player p2,
            Player p3, Player croupier, List<Card> deck){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.croupier = croupier;
        this.deck = deck;
    }
            
    protected void initTest1(){
        List<Card> handP = new ArrayList<>();
        handP = Arrays.asList(new Figure("j"), new Ace());
        p1.addCards(handP);

        handP = Arrays.asList(new PipCard(10), 
                new PipCard(5), new PipCard(6));
        p2.addCards(handP);
       
        handP = Arrays.asList(new PipCard(3), new PipCard(6), 
                new Ace(), new PipCard(3), 
                new Ace(), new Figure("k"));
        p3.addCards(handP);
        
        handP = Arrays.asList(new PipCard(9), new PipCard(7));
        croupier.addCards(handP);
        
        handP = Arrays.asList(new PipCard(5), new PipCard(4), 
                new Figure("k"), new PipCard(2));
        deck.addAll(handP);
    }
    
    protected void initTest2(){
        List<Card> handP = new ArrayList<>();
        handP = Arrays.asList(new PipCard(10), new Figure("k"));
        p1.addCards(handP);

        handP = Arrays.asList(new PipCard(10), new PipCard(2),
                new PipCard(6));
        p2.addCards(handP);
       
        handP = Arrays.asList(new PipCard(8), new PipCard(8),
                new PipCard(5));
        p3.addCards(handP);
        
        handP = Arrays.asList(new PipCard(5), new PipCard(10));
        croupier.addCards(handP);
        
        handP = Arrays.asList(new Ace(), new PipCard(3), 
                new Figure("k"), new PipCard(2)); 
        deck.addAll(handP);
    }
    
    protected void initTestRandom(){
        List<Card> handP = new ArrayList<>();
        handP = Arrays.asList(new Ace(), new Figure("J"));
        p1.addCards(handP);

        handP = Arrays.asList(new PipCard(10), new Ace());
        p2.addCards(handP);
       
        handP = Arrays.asList(new Figure("k"), new Ace());
        p3.addCards(handP);
        
        handP = Arrays.asList(new Figure("Q"), new Ace());
        croupier.addCards(handP); 
    }
}
