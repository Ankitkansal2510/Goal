package Java8.Stream.Quiz.SecondQuiz;

public class Transaction {

    private final Trader trader;
    private final int year;
    private final Integer value;

    public Transaction(Trader trader, int year, Integer value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return trader +
                "," + year +
                ","  + value ;
    }
}
