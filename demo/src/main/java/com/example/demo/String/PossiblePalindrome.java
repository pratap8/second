package com.example.demo.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class PossiblePalindrome {

	public static void main(String[] args) {
		String name = "wwwee";
		System.out.println(getPalin(name));		
	}
	static boolean getPalin(String name) {
		if(name==new StringBuilder(name).reverse().toString()) {
			return true;
		}
		HashMap<Character, Integer> numb = new HashMap<Character, Integer>();
		for(char aa:name.toCharArray()) {
			numb.put(aa, numb.getOrDefault(aa, 0)+1);
		}
		int count=0;
		for(int lower: numb.values()) {
			if(lower%2!=0) {
				count++;
			}
		}
		return count<=1;
	}
}
