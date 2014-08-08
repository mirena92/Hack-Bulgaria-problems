package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JoinTest {
    
    private Join testGlue;

    @Before
    public void setUp() throws Exception {
        testGlue = new Join();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStichMeUp() {
        assertEquals("Hello world", testGlue.stichMeUp(" ", "Hello", "world"));
        assertEquals("How are you", testGlue.stichMeUp(" ", "How", "are", "you"));
        assertEquals("I.am.22.years.old", testGlue.stichMeUp(".", "I", "am", 22, "years", "old"));
    }

}
