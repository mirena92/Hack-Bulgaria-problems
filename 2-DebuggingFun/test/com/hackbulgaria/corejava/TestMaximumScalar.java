package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumScalar {

    private MaximumScalar ms;
    
    @Before
    public void setUp() throws Exception {
        ms = new MaximumScalar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMaxScalarProduct() {
        int[] a = {1};
        int[] b = {1};
        assertEquals(1, ms.maxScalarProduct(a, b));
    }
    
    @Test
    public void testMaxScalarProductWithZero() {
        int[] a = {0, 1};
        int[] b = {1, 0};
        assertEquals(1, ms.maxScalarProduct(a, b));
    }
    
    @Test
    public void testGetNumberOfDigits() {
        assertEquals(1, ms.getNumberOfDigits(5));
        assertEquals(2, ms.getNumberOfDigits(25));
        assertEquals(3, ms.getNumberOfDigits(100));
        assertEquals(5, ms.getNumberOfDigits(12345));
    }
    

    
}
