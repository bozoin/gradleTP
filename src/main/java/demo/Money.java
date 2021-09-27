package demo;

public class Money {
    int amount;
    String devise;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Money(int amount, String devise) {
        this.amount = amount;
        this.devise = devise;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", devise='" + devise + '\'' +
                '}';
    }
}
