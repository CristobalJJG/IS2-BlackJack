package BlackJack;

import BlackJack.Cards.*;
import BlackJack.Cards.PipCard;
import BlackJack.Player.Player;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackjackTest {
    
    Player p1 = new Player("Player 1"), 
           p2 = new Player("Player 2"), 
           p3 = new Player("Player 3"), 
           croupier = new Player("Croupier");
    ArrayList<Card> deck = new ArrayList<>();
    
    private void notice (String msg){
        System.out.println(msg);
    }

    @Test
    public void test_IsBlackJack_Case1(){
        InitPlayers in = new InitPlayers(p1, p2, p3, croupier, deck);
        in.initTest1();
        assertTrue(Blackjack.isBlackJack(p1.getHand()));
        assertFalse(Blackjack.isBlackJack(p2.getHand()));
        assertFalse(Blackjack.isBlackJack(p3.getHand()));
        assertFalse(Blackjack.isBlackJack(croupier.getHand()));
        notice("Fin Case1");
    }
    
    @Test
    public void test_IsBlackJack_Case2(){
        InitPlayers in = new InitPlayers(p1, p2, p3, croupier, deck);
        in.initTest2();
        assertFalse(Blackjack.isBlackJack(p1.getHand()));
        assertFalse(Blackjack.isBlackJack(p2.getHand()));
        assertFalse(Blackjack.isBlackJack(p3.getHand()));
        assertFalse(Blackjack.isBlackJack(croupier.getHand()));
        notice("Fin Case2");
    }
    
    @Test
    public void test_IsBlackJack_All_True(){
        InitPlayers in = new InitPlayers(p1, p2, p3, croupier, deck);
        in.initTestRandom();
        assertTrue(Blackjack.isBlackJack(p1.getHand()));
        assertTrue(Blackjack.isBlackJack(p2.getHand()));
        assertTrue(Blackjack.isBlackJack(p3.getHand()));
        assertTrue(Blackjack.isBlackJack(croupier.getHand()));
        notice("Fin Case All true");
    }
    
    @Test
    public void test_Fill_Croupier_Case1(){
        InitPlayers in = new InitPlayers(p1, p2, p3, croupier, deck);
        in.initTest1();
        
        int size1 = croupier.getHand().size();
        assertTrue(Blackjack.getSumHand(croupier.getHand())<17);
        
        Blackjack.fillCroupier(croupier, deck);
        
        int size2 = croupier.getHand().size();
        assertTrue(Blackjack.getSumHand(croupier.getHand())>17);
        assertTrue(size1 != size2);
        
        Card[] newHand = new Card[]{new PipCard(9), new PipCard(7), 
            new PipCard(5)};
        for (int i = 0; i < newHand.length; i++) {
            boolean isTrue = newHand[i].equals(croupier.getHand().get(i));
            assertTrue("Iteración " + i, isTrue);
        }
        notice("Fin Fill_Croupier Case1");
    }
    
    @Test
    public void test_Fill_Croupier_Case2(){
        InitPlayers in = new InitPlayers(p1, p2, p3, croupier, deck);
        in.initTest2();
        
        int size1 = croupier.getHand().size();
        assertTrue(Blackjack.getSumHand(croupier.getHand())<17);
        
        Blackjack.fillCroupier(croupier, deck);
        
        int size2 = croupier.getHand().size();
        assertTrue(Blackjack.getSumHand(croupier.getHand())>17);
        assertTrue(size1 != size2);
        
        Card[] newHand = new Card[]{new PipCard(5), new PipCard(10), 
            new Ace(), new PipCard(3)};
        for (int i = 0; i < newHand.length; i++) {
            boolean isTrue = newHand[i].equals(croupier.getHand().get(i));
            assertTrue("Iteración " + i, isTrue);
        }
        notice("Fin Fill_Croupier Case2");
    }
    
    @Test
    public void test_Get_Winners_Case1(){
        InitPlayers in = new InitPlayers(p1, p2, p3, croupier, deck);
        in.initTest1();
        
        String[] expectedWinners = new String[]{"Player 1"};
        String[] winners = Blackjack.getWinners(p1, p2, p3, croupier, deck);

        assertArrayEquals(expectedWinners, winners);
        
        notice("Fin Get Winners Case1");
    }
    
    @Test
    public void test_Get_Winners_Case2(){
        InitPlayers in = new InitPlayers(p1, p2, p3, croupier, deck);
        in.initTest2();
        
        String[] expectedWinners = new String[]{"Player 1", "Player 3"};
        String[] winners = Blackjack.getWinners(p1, p2, p3, croupier, deck);

        assertArrayEquals(expectedWinners, winners);
        notice("Fin Get Winners Case2");
    }
    
}

