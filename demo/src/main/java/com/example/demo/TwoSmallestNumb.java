package com.example.demo;

import java.util.Arrays;
import java.util.TreeSet;

public class TwoSmallestNumb {
public static void main(String[] args) {
	Compute compute = new Compute();
	long[] a= {1,1,1,1,1};
	long[] c=compute.minAnd2ndMin(a, 5);
	for(long e:c) {
		System.out.println(e);
	}
}
}

class Compute 
{
    public long[] minAnd2ndMin(long a[], long n) { 
    	long min1 = Long.MAX_VALUE; // first_min
        long min2 = Long.MAX_VALUE; // second_min
       
        
        for(int i=0; i<n; i++)
        {
            if(a[i] < min1)
            {
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i] < min2 && a[i] != min1)
            {
                min2 = a[i];
            }
        }
        
        if (min2 == Long.MAX_VALUE) {
            return new long[]{-1};  
        }
        else {
            long[] ans = {min1, min2};
            return ans;
        }
    }
}




