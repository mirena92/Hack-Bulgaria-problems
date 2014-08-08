package com.hackbulgaria.corejava;
import java.util.LinkedHashMap;
import java.util.Set;

public class ConvertHashMap {
    
    public static String hashMapToString (LinkedHashMap<? extends Object, ? extends Object> map)
    {
        StringBuilder sb = new StringBuilder();
        Set<? extends Object> keySet = map.keySet();
        for(Object x: keySet)
        {
            sb.append(x);
            sb.append(":");
            sb.append(map.get(x));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
