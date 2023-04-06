package ru.netology.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    CreditAccount crAcc = new CreditAccount("Кредитный", -10000);
    @Test
    void add() {
        int amount1 = 5000;
        boolean expect1 = true;
        Assertions.assertEquals(expect1,crAcc.add(amount1));

        int amount2 = 6000;
        boolean expect2 = false;
        Assertions.assertEquals(expect2,crAcc.add(amount2));

        int amount3 = 4000;
        boolean expect3 = true;
        Assertions.assertEquals(expect3,crAcc.pay(amount3));
    }
}