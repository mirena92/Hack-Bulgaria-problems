package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckExpressionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCheck() {
        assertTrue(CheckExpression.Check("()()()"));
        assertFalse(CheckExpression.Check("())(()"));
        assertTrue(CheckExpression.Check("((())())"));
        assertFalse(CheckExpression.Check("()()())))((())("));
    }
}
