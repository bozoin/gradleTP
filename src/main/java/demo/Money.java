package demo;

import java.util.Objects;

public class Money {
    int amount;
    String devise;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(devise, money.devise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, devise);
    }

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

    public Money add(Money that) {
        return new Money(this.amount+that.amount,this.devise);
    }
}
