package demo;

public class Money {
    int amount;
    String devise;

    public Money(int amount, String _devise) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount + "devise" + devise +
                '}';
    }
}
