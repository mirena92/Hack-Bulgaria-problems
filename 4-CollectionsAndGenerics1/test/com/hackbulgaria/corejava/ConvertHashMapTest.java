package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConvertHashMapTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testHashMapToString() {
        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();
        map1.put('a', 1);
        map1.put('b', 2);
        map1.put('e', 5);
        
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(135, "Ivan");
        map2.put(127, "Stoyan");
        map2.put(155, "Penka");
        
        assertEquals("a:1 b:2 e:5", ConvertHashMap.hashMapToString(map1));
        assertEquals("135:Ivan 127:Stoyan 155:Penka", ConvertHashMap.hashMapToString(map2));        
    }

}
