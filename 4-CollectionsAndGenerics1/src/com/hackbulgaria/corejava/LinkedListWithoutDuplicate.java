package com.hackbulgaria.corejava;

import java.util.LinkedList;

public class LinkedListWithoutDuplicate<E> extends LinkedList<E> {
    
    private static final long serialVersionUID = 1L;

    private boolean isDuplicate(E newObject)
    {
        for(E current: this) {
            if(newObject.equals(current))
                return true;
        }
        return false;
    }
    
    @Override
    public boolean add(E obj)
    {
        if(!isDuplicate(obj))
        {
            super.add(obj);
            return true;
        }
        return false;
    }

}
