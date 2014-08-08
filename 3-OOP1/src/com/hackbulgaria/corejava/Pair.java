package com.hackbulgaria.corejava;

public class Pair {
    
    Object firstObject;
    Object secondObject;
    
    public Pair (Object obj1, Object obj2)
    {
        firstObject = obj1;
        secondObject = obj2;
    }
    
    public Object getFirstObject()
    {
        return firstObject;
    }
    
    public Object getSecondObject()
    {
        return secondObject;
    }
    
    public void setFirstObject(Object obj)
    {
        firstObject = obj;
    }
    
    public void setSecondObject(Object obj)
    {
        secondObject = obj;
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Pair)
        {
            if(firstObject.equals(((Pair)obj).getFirstObject()) && secondObject.equals(((Pair)obj).secondObject))
                return true;
        }
        return false;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(firstObject.toString());
        sb.append(secondObject.toString());
        
        return sb.toString();
    }
}
