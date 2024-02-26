package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactorialTest {

    @Test
    public void testFactorialPositiveCases() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
        assertEquals(5040, Factorial.factorial(7));
        assertEquals(40320, Factorial.factorial(8));
        assertEquals(362880, Factorial.factorial(9));
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
    public void testFactorialNegativeCases() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-5));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-10));
    }

    @Test
    public void testFactorialLargeCases() {
        assertTrue(Factorial.factorial(170) > 0);
        assertTrue(Factorial.factorial(171) > 0);
        assertTrue(Factorial.factorial(172) > 0);
        assertTrue(Factorial.factorial(173) > 0);
        assertTrue(Factorial.factorial(174) > 0);
        assertTrue(Factorial.factorial(175) > 0);
        assertTrue(Factorial.factorial(176) > 0);
        assertTrue(Factorial.factorial(177) > 0);
        assertTrue(Factorial.factorial(178) > 0);
        assertTrue(Factorial.factorial(179) > 0);
        assertTrue(Factorial.factorial(180) > 0);
    }
}