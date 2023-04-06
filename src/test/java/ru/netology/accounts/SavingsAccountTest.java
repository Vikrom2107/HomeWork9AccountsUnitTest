package ru.netology.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount saveAcc = new SavingsAccount("Накопительный", 40000, 10000);
    @Test
    void pay() {
        int amount1 = 5000;
        boolean expect1 = true;
        Assertions.assertEquals(expect1,saveAcc.pay(amount1));

        int amount2 = 10000;
        boolean expect2 = true;
        Assertions.assertEquals(expect2,saveAcc.pay(amount2));

        int amount3 = 4000;
        boolean expect3 = true;
        Assertions.assertEquals(expect3,saveAcc.pay(amount3));

        int amount4 = 20000;
        boolean expect4 = false;
        Assertions.assertEquals(expect4,saveAcc.pay(amount4));
    }
}