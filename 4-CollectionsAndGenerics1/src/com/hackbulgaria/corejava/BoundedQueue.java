package com.hackbulgaria.corejava;

import java.util.PriorityQueue;

public class BoundedQueue<E> extends PriorityQueue<E> {
    
    private static final long serialVersionUID = 1L;
    private int limit;
    private int numberElelemnts=0;
    
    public BoundedQueue(int size) {
        super();
        limit = size;       
    }
    
    @Override
    public boolean offer(E e) {
        if(numberElelemnts==limit)
        {
            this.poll();
            super.offer(e);
            numberElelemnts++;
        }
        else
        {
            super.offer(e);
            numberElelemnts++;
        }
        return true;
    }
    
    @Override
    public E poll() {
        numberElelemnts--;
        return super.poll();
    }
}

