package com.hackbulgaria.corejava;

import java.util.Arrays;

public class MaximumScalar {

    public long maxScalarProduct(int[] a, int[] b) {
        long result = 0;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0; i<a.length; i++)
        {
            result+=a[i]*b[i];
        }
        return result;
    }
    
    public int getNumberOfDigits(int n) {
        int br=0;
        
        while(n!=0)
        {
            br++;
            n/=10;
        }
            
        return br;
    }
}