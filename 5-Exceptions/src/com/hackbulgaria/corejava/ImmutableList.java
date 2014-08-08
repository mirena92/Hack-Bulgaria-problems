package com.hackbulgaria.corejava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;


public class ImmutableList<E> extends ArrayList<E> {
      
    private static final long serialVersionUID = 1L;

    public ImmutableList (Collection<? extends E> collection) {
        collection.retainAll(this);
    }
    
    @Override
    public boolean add(E e) {
        throw new ImmutableExceðtion(new ImmutableExceptionParameter());
    }
    
    @Override
    public void add(int index, E element) {
        throw new ImmutableExceðtion(new ImmutableExceptionParameter());
    }
    
    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new ImmutableExceðtion(new ImmutableExceptionParameter());
    }
    
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new ImmutableExceðtion(new ImmutableExceptionParameter());
    }
    
    @Override
    public E set(int index, E element) {
        throw new ImmutableExceðtion(new ImmutableExceptionParameter());
    }
    
    @Override
    public ListIterator<E> listIterator(int index) {
        throw new ImmutableExceðtion(new ImmutableExceptionParameter());
    }
    
    @Override
    public E remove(int index) {
        throw new ImmutableExceðtion(new ImmutableExceptionParameter());
    }
    
    public static void main(String[] args) {
        Collection<Integer> inputList = (Collection<Integer>) Arrays.asList(5, 10, 15);
        
        ImmutableList<Integer> list = new ImmutableList<> (inputList);
        list.add(14);
    }
}
