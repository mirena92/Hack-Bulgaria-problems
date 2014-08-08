package com.hackbulgaria.corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoundedQueueTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testOfferE() {
        BoundedQueue<Integer> boundedQueue = new BoundedQueue<>(3);
        boundedQueue.offer(1);
        boundedQueue.offer(2);
        boundedQueue.offer(3);
        boundedQueue.offer(4);
        boundedQueue.offer(5);
        
        assertTrue(boundedQueue.size()==3);
        assertTrue(boundedQueue.poll()==3);
        assertTrue(boundedQueue.poll()==4);
        assertTrue(boundedQueue.poll()==5);
    }

}
