package com.hackbulgaria.corejava;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Count {
    
    public static LinkedHashMap<String, Integer> countWords (String s)
    {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        List<String> words = Arrays.asList(s.split("[ .,!]+"));
        int number;
        
        for(String current : words)
        {
            if(!map.containsKey(current))
                map.put(current, 1);
            else
            {
                number=map.get(current) + 1;
                map.put(current, number);
            }
        }
        return map;
    }
}
