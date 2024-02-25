package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StackTest {
    private  Stack stack;
    @BeforeEach
    public void setUp() {
        // Code exécuté avant chaque méthode de test
        stack = new Stack();
    }
    @Test
    void PushShouldAddElementTothetopOf_Stack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.size());
        assertEquals(3, stack.peek());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.peek());
    }
    @Test
    public void PushShouldExpandArrayifStackIsfull() {
        for (int i = 0; i < Stack.INITIAL_CAPACITY ; i++) {
            stack.push(i);
        }
        assertEquals(10,stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(13,stack.size());
    }


    @Test
    public void testPop_In_the_Natural_functin_() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.size());

        assertEquals(2, stack.peek());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.peek());
        assertEquals(1, stack.pop());
        assertEquals(-1, stack.peek());
        assertEquals(-1, stack.pop());
    }

    @Test
    public void testPopOnEmptyStack_If_return_Exception() {

        assertThrows(IllegalStateException.class, stack::pop);
    }
    @Test
    public void test_Peep_In_the_Natural_functin_() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
        assertEquals(3, stack.peek());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.peek());
        assertEquals(2, stack.size());

    }


    @Test
    public void testPeekOnEmptyStack() {

        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    public void testIsEmpty() {

        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }


    @Test
    void Stack_Is_Empty() {

        assertTrue(stack.isEmpty());
        stack.push(100);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    void TestSize() {

        assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }



    }











