package com.example.demo.String;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharInString {

	public static void main(String[] args) {
		String a="aaazzzsssdddffff";
		printStack(a);
	}
	static void printStack(String a) {
		HashMap<Character, Integer> longer = new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++) {
			longer.put(a.charAt(i), longer.getOrDefault(a.charAt(i), 0)+1);
		}
		int i=0;
		char b = 0;
		for(Map.Entry<Character, Integer> max: longer.entrySet()) {
			if(max.getValue()>i) {
				i=max.getValue();
				b=max.getKey();
			}
		}
		System.out.println(b);
	}
}
