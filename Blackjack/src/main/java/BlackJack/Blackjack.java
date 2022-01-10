package BlackJack;

import BlackJack.Cards.Ace;
import BlackJack.Cards.Card;
import BlackJack.Player.Player;
import java.util.ArrayList;
import java.util.List;

public class Blackjack {
    
    private final static int BJ = 21;
    private final static int MAX_CROUPIER = 17;

    public static String[] getWinners(Player player1, Player player2, 
        Player player3, Player croupier, List<Card> deck){
        
        List<Player> Players = new ArrayList<>();
        Players.add(player1); Players.add(player2); Players.add(player3); 
        
        List<Player> winners = new ArrayList<>();
        
        fillCroupier(croupier, deck);
        
        for(Player player : Players){
            List<Card> handCrourpier = croupier.getHand(); 
            List<Card> handPlayer = player.getHand(); 
        
            if(isBlackJack(handCrourpier)){
                return new String[]{};
            } 
            if(isWinner(handCrourpier, handPlayer)){
                winners.add(player);
            }
            System.out.println(player.getName() + " Suma: " + getSumHand(player.getHand()));
        }
        System.out.println(croupier.getName() + " Suma: " + getSumHand(croupier.getHand()));

        
        String[] winnersName = new String[winners.size()];
        for (int i = 0; i < winnersName.length; i++) {
            winnersName[i] = winners.get(i).getName();
            
        }
        return winnersName;
    }
    
    private static boolean isWinner(List<Card> handCrourpier, 
        List<Card> handPlayer) {   
        if(isBlackJack(handPlayer)){return true;}
        int sumCroupier = getSumHand(handCrourpier);
        int sumPlayer = getSumHand(handPlayer);
        if(sumPlayer <= BJ){
            if((sumCroupier > BJ) || (sumCroupier < sumPlayer)){
                return true;
            }       
        }
        return false;
    }

    public static boolean isBlackJack(List<Card> hand) {
        if((getSumHand(hand) != BJ) || (hand.size() != 2)){
            return false;
        }
        if(hand.get(0).getValue() == 10){
            return (hand.get(1).getValue() == 11);
        }else{
            return(hand.get(1).getValue() == 10);
        }
    }

    public static int getSumHand(List<Card> hand) {
        int sum = 0, aces = 0;

        for (Card card : hand) { 
            sum += card.getValue(); 
            if(card instanceof Ace){aces++;}
        }
        
        if(aces != 0){
                while(sum>21 && aces>0){ sum -= 10; aces--; }
            }
        return sum;
    }

    public static void fillCroupier(Player croupier, List<Card> deck) {
        List<Card> hand = croupier.getHand();
        int sum = getSumHand(hand);
        
        int i = 0;
        while(sum < MAX_CROUPIER){
            Card c = deck.get(i);
            
            croupier.addCard(c);
            hand = croupier.getHand();
            
            sum = getSumHand(hand);
            i++; 
        }
    }

    private Blackjack() {
    }
}
