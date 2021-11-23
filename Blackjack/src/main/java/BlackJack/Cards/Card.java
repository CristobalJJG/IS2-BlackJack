package BlackJack.Cards;

public abstract class Card {
    private final int value;
    
    public Card(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    
    public abstract String toString();
    
    public abstract boolean equals(Object c);
}
