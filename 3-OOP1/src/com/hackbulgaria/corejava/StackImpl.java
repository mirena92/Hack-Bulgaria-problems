package com.hackbulgaria.corejava;

public class StackImpl implements Stack {

    protected Object[] obj;
    protected int size = 0;
    
    public StackImpl (int size)
    {
        obj = new Object[size];
    }
    
    @Override
    public void push(Object obj) throws Exception {
        this.obj[size]=obj;
        size++;
    }

    @Override
    public Object pop() {
        if(size>0)
        {
            size--;
            return obj[size];
        }
        return null;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public void clear() {
        size=0;
    }

    @Override
    public boolean isEmpty() {
        if(size==0)
            return true;
        return false;
    }

}
