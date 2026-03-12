public class Pot {

    private int total;

    public void add(int amount) {
        total += amount;
    }

    public int getTotal() {
        return total;
    }

    public void reset() {
        total = 0;
    }
}
