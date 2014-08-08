package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCountWords() {
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Hello", 1);
        map1.put("how", 1);
        map1.put("are", 1);
        map1.put("you", 1);
        
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Ninjas", 1);
        map2.put("are", 2);
        map2.put("all", 2);
        map2.put("over", 1);
        map2.put("the", 1);
        map2.put("place", 1);
        map2.put("We", 1);
        map2.put("going", 1);
        map2.put("to", 1);
        map2.put("die", 1);
        
        
        assertEquals(map1, Count.countWords("Hello how are you"));
        assertEquals(map2, Count.countWords("Ninjas are all over the place! We are all going to die!"));
    }

}
