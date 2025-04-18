package com.example.demo.String;

import java.util.HashMap;
import java.util.Map;

public class Highest_Repeated_Char_In_String {

	public static void main(String[] args) {
		String name = "Phoolbaburajpratapsingh";
		count(name);
	}
	static void count(String name) {
		HashMap<Character, Integer> aa = new HashMap<Character, Integer>();
		for(char a:name.toCharArray()) {
			aa.put(a, aa.getOrDefault(a, 0)+1);
			
		}
		int i=0;
		char c=0;
		for(Map.Entry<Character, Integer> bb: aa.entrySet()) {
			if(bb.getValue()>i) {
				i=bb.getValue();
				c=bb.getKey();
			}
		}
		System.out.println(c+" "+i);
	}
}
