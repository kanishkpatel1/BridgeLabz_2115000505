/* ===================== BankAccountTest.java ===================== */
package com.lcwd.test.bank;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setup() {
        account = new BankAccount(100.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
    }

    @Test
    public void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }
}
