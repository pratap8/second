package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {

	public static void main(String[] args) {
		SolutionWordPattrn pattrn = new SolutionWordPattrn();
		System.out.println(pattrn.wordPattern("abba", "dog cat cat fish"));
	}
}

class SolutionWordPattrn {
    public boolean wordPattern(String pattern, String s) {
        String[] b = s.split(" ");
        Map<Character, String> pat = new HashMap<Character, String>();
        if(b.length!=pattern.length()) {
        	return false;
        }
       for(int i=0;i<b.length;i++) {
    	   if(!pat.containsKey(pattern.charAt(i))) {
    		   if(pat.containsValue(b[i])) {
    			   return false;
    		   }
    	   }else if(!pat.get(pattern.charAt(i)).equals(b[i])) {
    		   return false;
    	   }
    	   pat.put(pattern.charAt(i), b[i]);
       }
        return true;
    }
}