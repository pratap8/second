package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group_Anagrams {

	public static void main(String[] args) {
		SolutionAnagrams anagram = new SolutionAnagrams();
		String[] strs = {"a"};
		System.out.println(anagram.groupAnagrams(strs) +"                 ooooooo");
	}
}

class SolutionAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	String [] c = new String[strs.length];
    	for(int i=0,j=0;i<strs.length;i++) {
    		char[] d = strs[i].toCharArray();
    		Arrays.sort(d);
    		c[i]=String.copyValueOf(d);
    	}
    	
    	List<List<String>> b = new ArrayList<List<String>>();
    	int counnt=0;
    	for(int i=0;i<c.length;i++) {
    		List<String> a = new ArrayList<String>();
    		if(!c[i].isEmpty()) {
    			a.add(strs[i]);
    			counnt++;
        		for(int j=i+1;j<c.length;j++) {
        			if(c[i].equals(c[j]) && !c[j].isEmpty()) {
        				a.add(strs[j]);
            			c[j]="";
            			counnt++;
            		}
        		}
        		
        			b.add(a);
        			if(counnt>strs.length) {
            			break;
            		}
        		
    		}
   			
   			
    		
    	}
    	
		return b;
        
    }
}