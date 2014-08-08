package com.hackbulgaria.corejava;

public interface Stack {
    
    void push(Object obj) throws Exception;
    Object pop();
    int length();
    void clear();
    boolean isEmpty();
    
}
