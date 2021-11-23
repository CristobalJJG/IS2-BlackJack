package BlackJack.Cards;

public class Ace extends Card{

    private final int secondValue = 1;

    public Ace() {
        super(11);
    }

    public int getSecondValue() {
        return this.secondValue;
    }

    @Override
    public String toString() {
        return "A";
    }
    
    public String toFullString() {
        return "Ace";
    }
    
    @Override
    public boolean equals(Object c){
        return(c instanceof Ace);
    }
}
