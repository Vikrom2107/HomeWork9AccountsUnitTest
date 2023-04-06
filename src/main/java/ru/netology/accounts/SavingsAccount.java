package ru.netology.accounts;

public class SavingsAccount extends Account{
    private long minAmount;

    public SavingsAccount (String name, long balance, long minAmount) {
        super(name, balance);
        this.minAmount = minAmount;
    }
    @Override
    public boolean pay(long amount) {
        if (balance - amount < minAmount) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }
}
