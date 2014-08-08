package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PairTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPair() {
        Pair obj1 = new Pair(15, "Ivo");
        Pair obj2 = new Pair(15, "Ivo");
        Pair obj3 = new Pair("Ivo", 15);
        assertTrue(obj1.equals(obj2));
        assertFalse(obj2.equals(obj3));
    }

}
