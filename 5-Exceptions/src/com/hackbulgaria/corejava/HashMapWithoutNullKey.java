package com.hackbulgaria.corejava;
import java.util.HashMap;


public class HashMapWithoutNullKey<K, V> extends HashMap<K, V> {
    
    private static final long serialVersionUID = 1L;
    boolean acceptNullKeys;
    
    public HashMapWithoutNullKey() {
        super();
        acceptNullKeys=false;
    }

    public void setAcceptNullKeys (boolean b)
    {
        acceptNullKeys=b;
    }
    
    @Override
    public V put(K key, V value) {
        if(key==null)
        {
            if(acceptNullKeys) {
               return super.put(key, value);
            }
            else throw new NullKeyException();
        }
        else
            return super.put(key, value);               
    }
    
    @Override
    public V get(Object key) {
        if(key==null)
        {
            if(acceptNullKeys) {
               return super.get(key);
            }
            else throw new NullKeyException();
        }
        else
            return super.get(key);
    }
    
    public static void main (String[] args) {
        HashMapWithoutNullKey<String, Integer> map = new HashMapWithoutNullKey<>();
        map.setAcceptNullKeys(true);
        map.put("jfjfds", 18);
        map.put(null, 15);
        map.setAcceptNullKeys(false);
        map.get(null);
    }
}
