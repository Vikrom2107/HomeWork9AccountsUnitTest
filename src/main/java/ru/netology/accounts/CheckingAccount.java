package ru.netology.accounts;


public class CheckingAccount extends Account{
    public CheckingAccount (String name, long balance) {
        super(name, balance);
    }
    @Override
    public boolean pay(long amount) {
        if (balance - amount < 0) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }
}
