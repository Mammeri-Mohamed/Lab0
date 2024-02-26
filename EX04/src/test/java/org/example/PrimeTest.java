package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTest {

    @Test
    public void testIsPrimePositiveCases() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(17));
        assertTrue(Prime.isPrime(19));
        assertTrue(Prime.isPrime(23));
        assertTrue(Prime.isPrime(29));
        assertTrue(Prime.isPrime(31));
    }

    @Test
    public void testIsPrimeEvenCasesShouldBereturnFalse() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(10));
        assertFalse(Prime.isPrime(12));
        assertFalse(Prime.isPrime(14));
        assertFalse(Prime.isPrime(16));
        assertFalse(Prime.isPrime(18));
        assertFalse(Prime.isPrime(20));
        assertFalse(Prime.isPrime(22));
        assertFalse(Prime.isPrime(24));
        assertFalse(Prime.isPrime(26));
        assertFalse(Prime.isPrime(28));
        assertFalse(Prime.isPrime(30));
        assertFalse(Prime.isPrime(32));
        assertFalse(Prime.isPrime(34));
        assertFalse(Prime.isPrime(36));
        assertFalse(Prime.isPrime(40));
        assertFalse(Prime.isPrime(42));
        assertFalse(Prime.isPrime(44));
        assertFalse(Prime.isPrime(46));
        assertFalse(Prime.isPrime(48));
        assertFalse(Prime.isPrime(50));
        assertFalse(Prime.isPrime(52));
        assertFalse(Prime.isPrime(54));
        assertFalse(Prime.isPrime(56));
        assertFalse(Prime.isPrime(58));
    }

    @Test
    public void testIsPrimeIFTwoThreeCasesShouldBeReturnTrue() {
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(2));
    }
}