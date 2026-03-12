import java.util.*;

public class Game {

    private List<Player> players;
    private Dealer dealer;
    private Pot pot;
    private List<Card> board;

    public Game() {

        players = new ArrayList<>();
        dealer = new Dealer();
        pot = new Pot();
        board = new ArrayList<>();

    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void startRound() {

        for (Player p : players) {
            p.clearHand();
        }

        dealer.dealHoleCards(players);

        board.addAll(dealer.dealFlop());
        board.add(dealer.dealTurn());
        board.add(dealer.dealRiver());

        determineWinner();

    }

    private void determineWinner() {

        Player bestPlayer = null;
        HandRank bestRank = HandRank.HIGH_CARD;

        for (Player p : players) {

            List<Card> all = new ArrayList<>();

            all.addAll(p.getHand());
            all.addAll(board);

            HandRank rank = HandEvaluator.evaluate(all);

            if (bestPlayer == null || rank.ordinal() > bestRank.ordinal()) {
                bestPlayer = p;
                bestRank = rank;
            }

        }

        System.out.println("Winner: " + bestPlayer.getName() + " with " + bestRank);

    }

}
