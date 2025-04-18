package com.example.demo.String;

import java.util.HashMap;
import java.util.Map;

public class Longest_Repeating_Char {

	public static void main(String[] args) {
		String a="phoolbaburajpratapsinghoo";
		Map<Character, Integer> aa = new HashMap<Character, Integer>();
		for(char c:a.toCharArray()) {
			aa.put(c, aa.getOrDefault(c, 0)+1);
		}
		int max=0;
		char c=0;
		for(Map.Entry<Character, Integer> v:aa.entrySet()) {
			if(v.getValue()>max) {
				max=v.getValue();
				c=v.getKey();
			}
		}
		System.out.println(c);
		
	}
}
