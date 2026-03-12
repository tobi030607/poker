public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        game.addPlayer(new Player("Alice", 1000));
        game.addPlayer(new Player("Bob", 1000));

        game.startRound();

    }

}
