package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {

    @Test
    public void testDepositPositiveAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testDepositZeroAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(0);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            BankAccount account = new BankAccount(100, 0.05);
            account.deposit(-50);
        });
    }

    @Test
    public void testWithdrawPositiveAmountLessThanBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testWithdrawPositiveAmountEqualBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(100);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testWithdrawPositiveAmountGreaterThanBalance() {
        assertThrows(IllegalStateException.class, () -> {
            BankAccount account = new BankAccount(100, 0.05);
            account.withdraw(150);
        });
    }

    @Test
    public void testWithdrawZeroAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(0);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            BankAccount account = new BankAccount(100, 0.05);
            account.withdraw(-50);
        });
    }

    @Test
    public void testTransferPositiveAmount() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(200, 0.05);
        account1.transfer(50, account2);
        assertEquals(50, account1.getBalance());
        assertEquals(250, account2.getBalance());
    }

    @Test
    public void testTransferZeroAmount() {
        BankAccount account1 = new BankAccount(100,0.05 );
        BankAccount account2 = new BankAccount(200, 0.05);
        account1.transfer(0, account2);
        assertEquals(100, account1.getBalance());
        assertEquals(200, account2.getBalance());
    }

    @Test
    public void testTransferNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            BankAccount account1 = new BankAccount(100, 0.05);
            BankAccount account2 = new BankAccount(200, 0.05);
            account1.transfer(-50, account2);
        });
    }

    @Test
    public void testTransferFromNullAccount() {
        assertThrows(NullPointerException.class, () -> {
            BankAccount account1 = new BankAccount(100, 0.05);
            account1.transfer(50, null);
        });
    }

    @Test
    public void testAddInterest() {
        BankAccount account = new BankAccount(100, 0.05);
        account.addInterest();
        assertTrue(account.getBalance() > 100);
    }

    @Test
    public void testAddInterestZeroRate() {
        BankAccount account = new BankAccount(100, 0);
        account.addInterest();
        assertEquals(100, account.getBalance());
    }
}