package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackImplTest {

    Stack stack;
    
    @Before
    public void setUp() {
        stack = new StackImplWithoutDuplicate(10);
        try
        {
            stack.push("Ivo");
            stack.push(22);
            stack.push(18.24);
            stack.push(22);
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
    

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPop() {
        assertEquals(18.24, stack.pop());
        assertEquals(22, stack.pop());
        assertEquals("Ivo", stack.pop());
        assertEquals(null, stack.pop());
    }

    @Test
    public void testLength() {
        assertEquals(3, stack.length());
        stack.pop();
        stack.pop();
        assertEquals(1, stack.length());
    }

    @Test
    public void testClear() {
        stack.clear();
        assertEquals(0, stack.length());
    }

    @Test
    public void testIsEmpty() {
        assertFalse(stack.isEmpty());
        stack.clear();
        assertTrue(stack.isEmpty());
    }

}
