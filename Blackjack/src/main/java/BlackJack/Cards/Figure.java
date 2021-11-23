package BlackJack.Cards;

public class Figure extends Card{
    
    private final String letter;

    public Figure(String letter) {
        super(10);
        this.letter = letter.toUpperCase();
    }

    public String getName() {
        return letter.toUpperCase();
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
    public String toFullString() {
        String name = "";
        switch(letter){
            case "J": name = "Jack"; break;
            case "Q": name = "Queen"; break;
            case "K": name = "King"; break;
        }
        return name;
    }
    
    @Override
    public boolean equals(Object c){
        if(c instanceof Figure){
            Figure f = (Figure) c;
            return(f.getName().equals(getName()));
        }
        return false;
    }
}
