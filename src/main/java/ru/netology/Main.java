package ru.netology;

import ru.netology.accounts.CheckingAccount;
import ru.netology.accounts.CreditAccount;
import ru.netology.accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAcc = new SavingsAccount("Накопительный счёт", 50000, 30000);
        CheckingAccount checkingAcc = new CheckingAccount("Расчётный счёт", 20000);
        CreditAccount creditAcc = new CreditAccount("Кредитный счёт", -15000);

        // Проверка накопительного счёта
        System.out.println(savingsAcc.getName() + ". Баланс: " + savingsAcc.getBalance());
        System.out.println("Пополняем: " + savingsAcc.add(5000));
        System.out.println("Баланс: " + savingsAcc.getBalance());
        System.out.println("Оплачиваем: " + savingsAcc.pay(20000));
        System.out.println("Баланс: " + savingsAcc.getBalance());
        System.out.println("Оплачиваем: " + savingsAcc.pay(15000));
        System.out.println("Баланс: " + savingsAcc.getBalance());
        System.out.println("**********************************");

        // Проверка расчётного счёта
        System.out.println(checkingAcc.getName() + ". Баланс: " + checkingAcc.getBalance());
        System.out.println("Пополняем: " + checkingAcc.add(4000));
        System.out.println("Баланс: " + checkingAcc.getBalance());
        System.out.println("Оплачиваем: " + checkingAcc.pay(20000));
        System.out.println("Баланс: " + checkingAcc.getBalance());
        System.out.println("Оплачиваем: " + checkingAcc.pay(10000));
        System.out.println("Баланс: " + checkingAcc.getBalance());
        System.out.println("**************************************");

        // Проверка кредитного счёта
        System.out.println(creditAcc.getName() + ". Баланс: " + creditAcc.getBalance());
        System.out.println("Оплачиваем: " + creditAcc.pay(4000));
        System.out.println("Баланс: " + creditAcc.getBalance());
        System.out.println("Пополняем: " + creditAcc.add(10000));
        System.out.println("Баланс: " + creditAcc.getBalance());
        System.out.println("Пополняем: " + creditAcc.add(10000));
        System.out.println("Баланс: " + creditAcc.getBalance());

    }
}