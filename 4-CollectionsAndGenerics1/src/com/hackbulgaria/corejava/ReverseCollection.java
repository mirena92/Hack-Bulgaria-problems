package com.hackbulgaria.corejava;

//!!! swt

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class ReverseCollection {
    
    public static <T> void reverseCollention (Collection<T> list)
    {
        Stack<T> stack = new Stack<T>();;
        Iterator<T> i = list.iterator();
        while(i.hasNext())
        {
            stack.push(i.next());
        } 
        list.clear();
        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }
    }
}
