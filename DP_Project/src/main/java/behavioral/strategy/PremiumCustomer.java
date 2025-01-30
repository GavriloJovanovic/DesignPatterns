package main.java.behavioral.strategy;

import java.util.Date;

public class PremiumCustomer extends Customer implements PaymentStrategy {
    private Date expirationDate;

    public PremiumCustomer(String name, double amount, Date expirationDate) {
        super(name, amount);
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(int amount) {
        setAmount(getAmount() - amount * 0.8);
    }
}
