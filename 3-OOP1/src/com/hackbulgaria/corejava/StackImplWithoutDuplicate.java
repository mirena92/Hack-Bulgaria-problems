package com.hackbulgaria.corejava;

public class StackImplWithoutDuplicate extends StackImpl {

    public StackImplWithoutDuplicate(int size) {
        super(size);
    }
    
    private boolean isDuplicate(Object newObject)
    {
        for(Object current: super.obj)
        {
            if(newObject.equals(current))
                return true;
        }
        return false;
    }
    
    @Override
    public void push(Object obj) throws Exception
    {
        if(!isDuplicate(obj))
            super.push(obj);
        else throw new Exception("The element is already exists in stack");
    }
}
