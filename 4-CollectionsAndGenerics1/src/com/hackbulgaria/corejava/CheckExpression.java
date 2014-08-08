package com.hackbulgaria.corejava;

public class CheckExpression {
    
    public static boolean Check (String expression)
    {   
        int num=0;
        if(expression.charAt(0)=='(' && expression.charAt(expression.length()-1)==')')
        {
            for(char x: expression.toCharArray())
            {
                if(x=='(')
                    num++;
                if(x==')')
                    num--;
                if(num<0)
                    return false;
            }
            if(num==0)
                return true;
        }
        return false;        
    }
    
}
