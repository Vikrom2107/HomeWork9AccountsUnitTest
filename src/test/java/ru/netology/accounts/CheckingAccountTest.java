package ru.netology.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    CheckingAccount checkAcc = new CheckingAccount("Счёт", 15000);
    @Test
    void pay() {
        int amount1 = 5000;
        boolean expect1 = true;
        Assertions.assertEquals(expect1,checkAcc.pay(amount1));

        int amount2 = 9000;
        boolean expect2 = true;
        Assertions.assertEquals(expect2,checkAcc.pay(amount2));

        int amount3 = 4000;
        boolean expect3 = false;
        Assertions.assertEquals(expect3,checkAcc.pay(amount3));
    }
}