package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.Time;

public class TimeTest {

    Time time;
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTest() {
        time = new Time(21, 45, 18, 21, 03, 2014);
        assertEquals("21:45:18 21.03.2014", time.toString());
        System.out.println(time.now());
    }

}
