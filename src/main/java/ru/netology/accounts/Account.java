package ru.netology.accounts;

public class Account {
    protected long balance;
    protected String name;

    public Account (String name, long balance) {
        this.name = name;
        this.balance = balance;
    }
    public boolean pay(long amount) {
        this.balance = this.balance - amount;
        return true;
    }
    public boolean add(long amount) {
        this.balance = this.balance + amount;
        return true;
    }
    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}

