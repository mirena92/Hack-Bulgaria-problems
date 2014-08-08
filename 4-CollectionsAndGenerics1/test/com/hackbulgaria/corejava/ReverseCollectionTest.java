package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseCollectionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReverseCollention() {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        ReverseCollection.reverseCollention(list);
        assertEquals(Arrays.asList(5, 3, 1), list);
        
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("you");
        secondList.add("are");
        secondList.add("How");
        ReverseCollection.reverseCollention(secondList);
        assertEquals(Arrays.asList("How", "are", "you"), secondList);
    }

}
