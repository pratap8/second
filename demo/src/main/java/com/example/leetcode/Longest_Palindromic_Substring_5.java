package com.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Longest_Palindromic_Substring_5 {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("cbbc"));
	}
	static String longestPalindrome(String s) {
        List<HashMap<Integer,Character>> val = new ArrayList<HashMap<Integer,Character>>();
        int k=0;
        int count=0;
        for(int i=0;i<s.length();i++) {
        	HashMap<Integer, Character> plain = new LinkedHashMap<Integer, Character>();
        	plain.put(k++, s.charAt(i));
        	for(int j=i+1;j<s.length();j++) {
        		if(plain.containsValue(s.charAt(i))) {
        			count++;
        			plain.put(k++, s.charAt(j));
        			break;
        		}else {
        			plain.put(k++, s.charAt(j));
        		}
        	}
        	if(count>0) {
        		count=0;
        		val.add(plain);
        	}
        	
        }
        StringBuilder builder = new StringBuilder();
        count=0;
        System.out.println(val);
        for(int i=0;i<val.size();i++) {
        	if(count<val.get(i).size()) {
        		count=val.get(i).size();
        		k=i;
        	}
        }
        for(char aa:val.get(k).values()) {
        	builder.append(aa);
        }
        return builder.toString();
    }
}
