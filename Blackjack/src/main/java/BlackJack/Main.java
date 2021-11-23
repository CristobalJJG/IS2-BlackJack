package BlackJack;

import BlackJack.Cards.Card;
import BlackJack.Player.Player;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("##Casos");
        case1();
        System.out.println("\n\n");
        case2();
    }
    
    private static void case1(){
        Player p1 = new Player("Player 1"), 
           p2 = new Player("Player 2"), 
           p3 = new Player("Player 3"), 
           croupier = new Player("Croupier");
        ArrayList<Card> deck = new ArrayList<>();
        
        
        System.out.println("###Caso 1");
        InitPlayers init = new InitPlayers(p1, p2, p3, croupier, deck);
        init.initTest1();
        
        System.out.println(p1.toString() + "(" + Blackjack.getSumHand(p1.getHand()) + ")");
        System.out.println(p2.toString() + "(" +  Blackjack.getSumHand(p2.getHand()) + ")");
        System.out.println(p3.toString() + "(" +  Blackjack.getSumHand(p3.getHand()) + ")");
        System.out.println(croupier.toString() + "(" +  Blackjack.getSumHand(croupier.getHand()) + ")");

        System.out.println("Deck: " + deck.toString() + "\n");
        
        String[] winners = Blackjack.getWinners(p1, p2, p3, croupier, deck);
        String w = "[";
        for (String winner : winners) {
            w += winner + ", ";
        }
        System.out.println("getWinners(..) -----> " + 
                w.substring(0,w.length()-2) + "]");
    }
    
    private static void case2(){
        Player p1 = new Player("Player 1"), 
           p2 = new Player("Player 2"), 
           p3 = new Player("Player 3"), 
           croupier = new Player("Croupier");
        ArrayList<Card> deck = new ArrayList<>();
        
        System.out.println("###Caso 2");
        InitPlayers init = new InitPlayers(p1, p2, p3, croupier, deck);
        init.initTest2();
        
        System.out.println(p1.toString() + "(" + Blackjack.getSumHand(p1.getHand()) + ")");
        System.out.println(p2.toString() + "(" +  Blackjack.getSumHand(p2.getHand()) + ")");
        System.out.println(p3.toString() + "(" +  Blackjack.getSumHand(p3.getHand()) + ")");
        System.out.println(croupier.toString() + "(" +  Blackjack.getSumHand(croupier.getHand()) + ")");

        System.out.println("Deck: " + deck.toString() + "\n");
        
        String[] winners = Blackjack.getWinners(p1, p2, p3, croupier, deck);
        String w = "[";
        for (String winner : winners) {
            w += winner + ", ";
        }
        System.out.println("getWinners(..) -----> " + 
                w.substring(0,w.length()-2) + "]");
    }
}
