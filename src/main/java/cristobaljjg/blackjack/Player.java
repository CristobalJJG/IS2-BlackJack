package cristobaljjg.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private final String name;
    private List<Card> hand;
    
    public Player(String name){
        this.name = name;
        hand = new ArrayList<>();
    }
    
}
