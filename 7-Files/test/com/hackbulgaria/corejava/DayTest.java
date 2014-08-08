package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayTest {

    @Test
    public void test() {
        assertEquals("Hi! I'm Friday!", Day.greetMe(Day.FRIDAY));
        assertEquals("Hi! I'm Wednesday!", Day.greetMe(Day.WEDNESDAY));
    }

}
