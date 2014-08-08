package com.hackbulgaria.corejava;

public class Join {
    
    public String stichMeUp(String delimiter, Object ... word ) {
                
        StringBuffer result = new StringBuffer();
        
        for(int i=0; i<word.length-1; i++)
        {
            result.append(word[i]);
            result.append(delimiter);
        }
        
        result.append((String)word[word.length-1]);

        return result.toString();
    }
}
