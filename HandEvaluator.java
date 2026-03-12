import java.util.*;

public class HandEvaluator {

    public static HandRank evaluate(List<Card> cards) {

        Map<Integer, Integer> counts = new HashMap<>();

        for (Card c : cards) {

            int v = c.getValue();

            counts.put(v, counts.getOrDefault(v, 0) + 1);

        }

        boolean pair = false;
        boolean three = false;
        boolean four = false;

        for (int c : counts.values()) {

            if (c == 2) pair = true;
            if (c == 3) three = true;
            if (c == 4) four = true;

        }

        if (four) return HandRank.FOUR_OF_A_KIND;

        if (three && pair) return HandRank.FULL_HOUSE;

        if (three) return HandRank.THREE_OF_A_KIND;

        if (pair) return HandRank.PAIR;

        return HandRank.HIGH_CARD;

    }

}
