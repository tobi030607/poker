import java.util.*;

public class Dealer {

    private Deck deck;

    public Dealer() {
        deck = new Deck();
    }

    public void dealHoleCards(List<Player> players) {

        for (int i = 0; i < 2; i++) {
            for (Player p : players) {
                p.receiveCard(deck.draw());
            }
        }

    }

    public List<Card> dealFlop() {

        List<Card> flop = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            flop.add(deck.draw());
        }

        return flop;
    }

    public Card dealTurn() {
        return deck.draw();
    }

    public Card dealRiver() {
        return deck.draw();
    }

}
