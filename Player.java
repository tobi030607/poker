import java.util.*;

public class Player {

    private String name;
    private int chips;
    private List<Card> hand;
    private boolean folded;

    public Player(String name, int chips) {
        this.name = name;
        this.chips = chips;
        this.hand = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public void clearHand() {
        hand.clear();
        folded = false;
    }

    public List<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public int getChips() {
        return chips;
    }

    public void bet(int amount) {
        chips -= amount;
    }

    public void win(int amount) {
        chips += amount;
    }

    public boolean isFolded() {
        return folded;
    }

    public void fold() {
        folded = true;
    }

}
