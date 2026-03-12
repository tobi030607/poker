import java.util.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        buildDeck();
        shuffle();
    }

    private void buildDeck() {

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {

        if (cards.isEmpty()) {
            throw new RuntimeException("Deck is empty");
        }

        return cards.remove(0);
    }

}
