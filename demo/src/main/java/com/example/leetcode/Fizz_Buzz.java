package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fizz_Buzz {
 public static void main(String[] args) {
	 SolutionFizz fizz = new SolutionFizz();
	 fizz.fizzBuzz(15);
	 Buzz buzz = new Buzz();
	 buzz.fizzBuzz(15);
}
}
class SolutionFizz {
    public List<String> fizzBuzz(int n) {
        String []a= new String[n];
        
        for(int i=0;i<n;i++) {
        	if((i+1)%3==0 && (i+1)%5==0 ) {
        		a[i]="FizzBuzz";
        	}
        	else if((i+1)%3==0) {
        		a[i]="Fizz";
        	}
        	else if((i+1)%5==0) {
        		a[i]="Buzz";
        	}
        	else {
        		a[i]=Integer.toString(i+1);
        	}
        }
        for(String e:a) {
        	System.out.print(e+" ");
        }
        List<String> b= Arrays.asList(a);
        return b;
    }
}

class Buzz{
    public List<String> fizzBuzz(int n) {
    	ArrayList<String> ans= new ArrayList<String>();
    	for(int i=0;i<n;i++) {
    		if((i+1)%3==0 && (i+1)%5==0) {
    			ans.add("FizzBuzz");
    		}
    		else if((i+1)%3==0) {
    			ans.add("Fizz");
    		}
    		else if((i+1)%5==0) {
    			ans.add("Buzz");
    		}
    		else {
    			ans.add(String.valueOf(i+1));
    		}
    	}
    	System.out.println();
    	for(String e:ans) {
    		System.out.print(e+" ");
    	}
    	return ans;
    }
}