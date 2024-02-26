package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class FibonacciTest {

    @Test
    public void testFibonacci() {

        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
    }

    @Test
    public void testNegativeArgument() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    public void testZeroArgumentIfreturnzero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testOneArgumentifreturnOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }
}