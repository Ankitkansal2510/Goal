package Java8.Stream.Grouping;

public class Transaction {

    private String currency;
    private Integer amount;

    public Transaction(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
